package com.collaboration.java.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.collaboration.java.dao.user.UserDao;
import com.collaboration.java.dto.CollaborationUserDTO;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional
	public CollaborationUserDTO getUserbyId(Long user_id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(CollaborationUserDTO dto) throws Exception {
		userDao.addUser(dto);

	}

}
