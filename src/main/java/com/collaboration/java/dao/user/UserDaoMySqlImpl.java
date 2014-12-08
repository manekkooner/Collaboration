package com.collaboration.java.dao.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.collaboration.java.dto.CollaborationUserDTO;
import com.collaboration.java.ibatis.mapper.UserMapper;

@Repository
public class UserDaoMySqlImpl implements UserDao {

	@Autowired
	private UserMapper userMapper;
	

	private static final Logger logger = LoggerFactory.getLogger(UserDaoMySqlImpl.class);
	
	
	@Override
	public CollaborationUserDTO getUserbyId(Long user_id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(CollaborationUserDTO dto) throws Exception {
		// TODO Auto-generated method stub
		userMapper.addProject(dto);
	}

}
