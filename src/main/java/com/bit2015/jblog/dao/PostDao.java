package com.bit2015.jblog.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bit2015.jblog.vo.PostVo;

@Repository
public class PostDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<PostVo> list(PostVo vo){
		System.out.println("dao + " + vo);
		List<PostVo> list=sqlSession.selectList("post.list", vo);
		return list;
	}
}
