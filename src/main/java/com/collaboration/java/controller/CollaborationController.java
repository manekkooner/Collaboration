package com.collaboration.java.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.collaboration.java.dto.CollaborationProject;


@Controller
public class CollaborationController {
	
	@Resource 
	private DataSource collabDatabase;
	
	private static final Logger logger = LoggerFactory.getLogger(CollaborationController.class);
	
	@RequestMapping(value = "/project/get/{project_id}", method = RequestMethod.GET)
	@ResponseBody
	public CollaborationProject getProject(@PathVariable("project_id") Long project_id)
	{
		ResultSet set=null;
		CollaborationProject colProj = new CollaborationProject();
		try {
			Connection conn = collabDatabase.getConnection();
			PreparedStatement sql = conn.prepareStatement("SELECT PROJECT_ID, NAME, DESCRIPTION from COLLABORATION_PROJECT");
            System.out.println(project_id);
			//sql.setLong(1, project_id);
            System.out.println("Fine");
			set = (ResultSet) sql.executeQuery();
			if (set.next()) {
			//System.out.println("Result Name is "+set.getString("NAME"));
			colProj.setProject_id(set.getLong(1));
			colProj.setName(set.getString(2));
			colProj.setDescription(set.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.info(e.toString());
		}
		return colProj;	
	}

}
