package com.collaboration.java.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.collaboration.java.dto.CollaborationProjectDTO;
import com.collaboration.java.service.project.ProjectService;
import com.collaboration.java.service.project.ProjectServiceImpl;


@Controller
public class CollaborationController {
	
	@Autowired
	private ProjectService ser;
	
	private static final Logger logger = LoggerFactory.getLogger(CollaborationController.class);
	
	
	
	@RequestMapping(value = "/project/getById/{project_id}", method = RequestMethod.GET)
	@ResponseBody
	public CollaborationProjectDTO getProjectById(@PathVariable("project_id") Long project_id)
	{
		
		try {
			ser = new ProjectServiceImpl();
			return ser.getProjectbyId(project_id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
