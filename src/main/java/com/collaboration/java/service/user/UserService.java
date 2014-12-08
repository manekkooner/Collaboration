package com.collaboration.java.service.user;


import com.collaboration.java.dto.CollaborationUserDTO;

public interface UserService {

		
		public CollaborationUserDTO getUserbyId(Long user_id) throws Exception;
	    public void addUser(CollaborationUserDTO dto) throws Exception;

	}
