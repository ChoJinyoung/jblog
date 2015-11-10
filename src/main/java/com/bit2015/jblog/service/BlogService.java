package com.bit2015.jblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit2015.jblog.dao.PostDao;
import com.bit2015.jblog.vo.PostVo;

@Service
public class BlogService {
	@Autowired
	PostDao postDao;
	
	public List<PostVo> list(PostVo vo){
		System.out.println("@Service + " + vo);
		List<PostVo> list=postDao.list(vo);
		return list;
	}
}
