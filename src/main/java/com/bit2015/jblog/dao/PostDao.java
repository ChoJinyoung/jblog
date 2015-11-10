package com.bit2015.jblog.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.bit2015.jblog.vo.PostVo;

@Repository
public class PostDao {
	
	private SqlSession sqlSession;
	public List<PostVo> list(long no){
		List<PostVo> list=sqlSession.selectList("post.list", no);
		return list;
	}
}
