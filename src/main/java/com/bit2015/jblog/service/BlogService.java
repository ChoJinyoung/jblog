package com.bit2015.jblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit2015.jblog.dao.BlogDao;
import com.bit2015.jblog.dao.BlogUserDao;
import com.bit2015.jblog.dao.CategoryDao;
import com.bit2015.jblog.dao.PostDao;
import com.bit2015.jblog.vo.BlogVo;
import com.bit2015.jblog.vo.CategoryVo;
import com.bit2015.jblog.vo.PostVo;

@Service
public class BlogService {
	@Autowired
	private PostDao postDao;
	@Autowired
	private BlogDao blogDao;
	@Autowired
	private BlogUserDao blogUserDao;
	@Autowired
	private CategoryDao categoryDao;

	public List<PostVo> list(PostVo vo) {
		
		List<PostVo> list = postDao.list(vo);
		return list;
	}

	public BlogVo settingDone(BlogVo vo) {
		BlogVo blogVo = blogDao.select(vo);
		return blogVo;
	}
	
	public void updateSetting(BlogVo vo){
		blogDao.update(vo);
	}

	public List<CategoryVo> categoryList(CategoryVo vo) {
		List<CategoryVo> list = categoryDao.list();
		return list;
	}

	public CategoryVo selectBlogNo(CategoryVo vo) {
		CategoryVo categoryVo = categoryDao.select(vo);
		return categoryVo;
	}

	public void categoryInsert(CategoryVo vo) {
		categoryDao.insert(vo);

	}
}
