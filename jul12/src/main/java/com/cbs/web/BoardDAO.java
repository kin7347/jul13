package com.cbs.web;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/*
 * @Controller  == Controller
 * @Service     == Service
 * @Repository  == DAO 
 */

@Repository
public class BoardDAO {
	//DAO는 DB랑 연결한다 
	@Autowired
	private SqlSession sqlSession;

}
