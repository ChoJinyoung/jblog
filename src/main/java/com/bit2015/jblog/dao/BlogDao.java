package com.bit2015.jblog.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bit2015.jblog.vo.BlogVo;

@Repository
public class BlogDao {

	@Autowired
	SqlSession sqlsession;

	public BlogVo select(BlogVo vo) {
		BlogVo blogVo = sqlsession.selectOne("blog.blogsetting", vo);
		return blogVo;
	}
	
	public void update(BlogVo vo){
		sqlsession.update("blog.updateByUserNo", vo);
	}

}
