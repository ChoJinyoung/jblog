package com.bit2015.jblog.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bit2015.jblog.vo.CategoryVo;

@Repository
public class CategoryDao {
	@Autowired
	private SqlSession sqlSession;
	
	public List<CategoryVo> list(){
		List<CategoryVo> list=sqlSession.selectList("category.list");
		return list;
	}
	public CategoryVo select(CategoryVo vo){
		CategoryVo categoryVo=sqlSession.selectOne("category.select",vo);
		return categoryVo;
	}
	
	public void insert(CategoryVo vo){
		sqlSession.insert("category.insert", vo);

	}
}
