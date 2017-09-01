package com.ljq.blog.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ljq.blog.mapper.BlogTBlogMapper;
import com.ljq.blog.mapper.BlogTBlogMapperCustom;
import com.ljq.blog.mapper.BlogTBlogclassifyMapperCustom;
import com.ljq.blog.mapper.BlogTBlogfileMapperCustom;
import com.ljq.blog.mapper.BlogTBlogsundryMapper;
import com.ljq.blog.po.BlogTBlog;
import com.ljq.blog.po.BlogTBlogCustom;
import com.ljq.blog.po.BlogTBlogVo;
import com.ljq.blog.po.BlogTBlogclassifyCustom;
import com.ljq.blog.po.BlogTBlogfileCustom;
import com.ljq.blog.po.BlogTBlogsundry;
import com.ljq.blog.service.BlogService;
import com.ljq.blog.util.QiNiuCos;
import com.ljq.bog.exception.BlogOptException;

public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogTBlogMapper blogTBlogMapper;

	@Autowired
	private BlogTBlogMapperCustom blogTBlogMapperCustom;

	@Autowired
	private BlogTBlogfileMapperCustom blogTBlogfileMapperCustom;
	@Autowired
	private BlogTBlogclassifyMapperCustom blogTBlogclassifyMapperCustom;
	@Autowired
	private BlogTBlogsundryMapper blogTBlogsundryMapper;

	@Autowired
	private QiNiuCos qiNiuCos;

	@Override
	public int insert(BlogTBlogVo blogTBlogVo) throws BlogOptException {

		// 将后台管理插入的博客汉字分类，转换成博客的id形式存储方便解析
		// 将后台管理插入的博客汉字分类，转换成博客的id形式存储方便解析
		BlogTBlog record = blogTBlogVo.getBlogTBlogCustom();
		try {
			record.setClassify(convertBlogClassify(record.getClassify()));
			
			//从数据库中读取这个博客的第一个图片文件，作为这个博客在列表显示时的间接图片introimg
			BlogTBlogfileCustom firstFileByBlog = blogTBlogfileMapperCustom.selectFirstFileByBlogId(record);
			if (firstFileByBlog != null && firstFileByBlog.getFilepath() != null) {
				record.setIntroimg(firstFileByBlog.getFilepath());
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new BlogOptException("插入数据前，设置分类及introimg时发生错误");
		}
		// 执行查询操作
		int col = blogTBlogMapper.insertSelective(record);

		// 插入博客杂项
		BlogTBlogsundry blogTBlogsundry = new BlogTBlogsundry();
		blogTBlogsundry.setBlogid(record.getId());
		blogTBlogsundryMapper.insertSelective(blogTBlogsundry);

		/*
		 * BlogTBlogCustom blogTBlogCustom = new BlogTBlogCustom();
		 * BeanUtils.copyProperties(record, blogTBlogCustom); BlogTBlogVo
		 * blogTBlogVo = new BlogTBlogVo();
		 * blogTBlogVo.setBlogTBlogCustom(blogTBlogCustom);
		 */

		// 验证服务器端上传的数据和实际有的数据是否一致，不一致删除服务器端的数据
		String content = record.getContent();
		Pattern pattern = Pattern.compile("http://file.itstudying.com/([^\\s$\"]*)");
		Matcher matcher = pattern.matcher(content);
		List<String> keyList = qiNiuCos.getFileKeyList(record.getId());// 服务器端存储的该博客文章中的文件所有文件id
		// 根据正则匹配到所有文章中的文件
		List<String> idList = new LinkedList<>();
		while (matcher.find()) {
			String s = matcher.group(1);
			idList.add(s);
		}
		// 删除两个集合中相同的，剩下的就是服务器中多余的，在调用七牛云的删除文件方法，进行删除文件
		keyList.removeAll(idList);
		if (keyList.size() != 0) {
			qiNiuCos.deleteFile(keyList);
		}

		return col;
	}

	@Override
	public List<BlogTBlogCustom> selectBlog(String pageNum, String pageSize, BlogTBlogVo blogTBlogVo) throws Exception {
		// TODO Auto-generated method stub
		PageHelper.startPage(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
		return blogTBlogMapperCustom.selectBlog(blogTBlogVo);
	}

	@Override
	public PageInfo selectBlogWithBlogfile(String pageNum, String pageSize, BlogTBlogVo blogTBlogVo) throws Exception {
		// TODO Auto-generated method stub
		// 调用分页的方法，首页查询第一页，每页显示3条数据
		PageHelper.startPage(Integer.parseInt(pageNum), Integer.parseInt(pageSize));
		List<BlogTBlogCustom> blogList = blogTBlogMapperCustom.selectBlogWithBlogfile(blogTBlogVo);
		// 将查询出的结果进行封装，每页显示3个
		return new PageInfo(blogList);
	}

	@Override
	public BlogTBlogCustom selectBlogWithBlogfileById(String id) throws Exception {
		// TODO Auto-generated method stub
		return blogTBlogMapperCustom.selectBlogWithBlogfileById(id);
	}

	@Override
	public List<TreeMap<String, Object>> selectBlogCountGroupByClassify() throws Exception {
		// TODO Auto-generated method stub
		return blogTBlogMapperCustom.selectBlogCountGroupByClassify();
	}

	@Override
	public BlogTBlogclassifyCustom selectBlogclassifyIdByClassify(String classify) throws Exception {
		// TODO Auto-generated method stub
		return blogTBlogclassifyMapperCustom.selectBlogclassifyIdByClassify(classify);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(String blogId, BlogTBlogVo blogTBlogVo) throws Exception {
		// TODO Auto-generated method stub
		BlogTBlogCustom blogCustom = blogTBlogVo.getBlogTBlogCustom();
		if (blogId.equals(blogCustom.getId())) {
			// 将后台管理插入的博客汉字分类，转换成博客的id形式存储方便解析
			blogCustom.setClassify(convertBlogClassify(blogCustom.getClassify()));
			return blogTBlogMapper.updateByPrimaryKeyWithBLOBs(blogCustom);
		} else {
			throw new Exception("编号不符");
		}
	}

	/**
	 * 
	 * 
	 * 将博客的分类转换成博客的分类id，方便解析
	 * 
	 * @param classify
	 * @return
	 * @throws Exception
	 */
	private String convertBlogClassify(String classify) throws Exception {
		BlogTBlogclassifyCustom blogTBlogclassifyCustom = selectBlogclassifyIdByClassify(classify);
		return blogTBlogclassifyCustom.getId();
	}

}
