package com.bit2015.jblog.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bit2015.jblog.vo.BlogUserVo;

@Repository
public class BlogUserDao {
	@Autowired
	private SqlSession sqlSession;

	public List<BlogUserVo> list() {
		List<BlogUserVo> list = sqlSession.selectList("user.listAll");
		return list;
	}

	public void insert(BlogUserVo vo) {
		sqlSession.insert("user.insert", vo);
		System.out.println(vo);
	}

	public BlogUserVo get(BlogUserVo vo) { // 로그인
		BlogUserVo userVo = sqlSession.selectOne("user.getByIdAndPassword", vo);
		return userVo;
	}
}
