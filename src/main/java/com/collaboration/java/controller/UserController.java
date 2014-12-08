package com.collaboration.java.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.collaboration.java.dto.CollaborationUserDTO;
import com.collaboration.java.service.user.UserService;



@Controller
public class UserController {
	
	@Autowired
	private UserService ser;
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	
	//public void insertProject(@PathVariable("name") String name, @PathVariable("descr") String description,@PathVariable("user_id") Long user_id, @PathVariable("first_wf_id") Long first_wf_id)
	@RequestMapping(value = "/user/insert", method = RequestMethod.POST)
	public @ResponseBody void  insertUser(@RequestBody CollaborationUserDTO proj)
	{	
		try {
			ser.addUser(proj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	  


}

