package com.bit2015.jblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit2015.jblog.dao.BlogDao;
import com.bit2015.jblog.dao.PostDao;
import com.bit2015.jblog.vo.BlogVo;
import com.bit2015.jblog.vo.PostVo;

@Service
public class BlogService {
	@Autowired
	private PostDao postDao;
	@Autowired
	private BlogDao blogDao;

	public List<PostVo> list(PostVo vo) {
		List<PostVo> list = postDao.list(vo);
		return list;
	}

	public BlogVo settingDone(BlogVo vo) {
		System.out.println("settingDone+ " + vo);
		BlogVo blogVo = blogDao.select(vo);
		return blogVo;
	}
}
