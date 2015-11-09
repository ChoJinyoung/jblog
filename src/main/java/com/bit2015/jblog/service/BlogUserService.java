package com.bit2015.jblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit2015.jblog.dao.BlogUserDao;
import com.bit2015.jblog.vo.BlogUserVo;

@Service
public class BlogUserService {
	@Autowired
	private BlogUserDao blogUserDao;

	public List<BlogUserVo> userList() {
		List<BlogUserVo> list = blogUserDao.list();
		return list;
	}

	public void join(BlogUserVo vo) {
		blogUserDao.insert(vo);
	}

	public BlogUserVo login(BlogUserVo vo) { // 로그인
		BlogUserVo userVo = blogUserDao.get(vo);
		return userVo;
	}
}
