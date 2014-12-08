package com.collaboration.java.dao.user;

import com.collaboration.java.dto.CollaborationUserDTO;

public interface UserDao {

	public CollaborationUserDTO getUserbyId(Long user_id) throws Exception;
    public void addUser(CollaborationUserDTO dto) throws Exception;
}
