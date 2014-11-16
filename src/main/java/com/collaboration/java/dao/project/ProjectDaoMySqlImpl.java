package com.collaboration.java.dao.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

import com.collaboration.java.dto.CollaborationProjectDTO;
import com.collaboration.java.ibatis.mapper.ProjectMapper;

@Repository
public class ProjectDaoMySqlImpl implements ProjectDao {

	@Autowired
	private ProjectMapper projectMapper;
	
	private static final Logger logger = LoggerFactory.getLogger(ProjectDaoMySqlImpl.class);
	

/*
	@Override
	public CollaborationProjectDTO getProjectbyId(Long project_id) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(datasource.getConnection());
		Connection conn =DataSourceUtils.getConnection(datasource);
		//conn = datasource.getConnection();
		//JdbcTemplate jdbcTemplate = new JdbcTemplate(projDatabase);
		CollaborationProjectDTO colProj = new CollaborationProjectDTO();
		ResultSet set=null;
		try {
			
			PreparedStatement sql = conn.prepareStatement("SELECT PROJECT_ID, NAME, DESCRIPTION from COLLABORATION_PROJECT where PROJECT_ID=?");
            System.out.println(project_id);
			sql.setLong(1, project_id);
			set = (ResultSet) sql.executeQuery();
			if (set.next()) {
			colProj.setProject_id(set.getLong(1));
			colProj.setName(set.getString(2));
			colProj.setDescription(set.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			logger.info(e.toString());
		}
		finally{
			conn.close();
		}
		return colProj;	
	}
*/
	@Override
	public CollaborationProjectDTO getProjectbyId(Long project_id) throws Exception
	{
		//return projectMapper.selectPerson(project_id);
		return projectMapper.getProjectById(project_id);
	}
	
	@Override
	public CollaborationProjectDTO getProjectbyName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<CollaborationProjectDTO> getAllPojects() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean deleteProject(Long project_id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void addProject(CollaborationProjectDTO dto) {
		// TODO Auto-generated method stub
		projectMapper.addProject(dto);
	}
	@Override
	public void updateProject(Long project_id, String name, String desc,
			Long started_by, Date created_dt) {
		// TODO Auto-generated method stub
		
	}

}
