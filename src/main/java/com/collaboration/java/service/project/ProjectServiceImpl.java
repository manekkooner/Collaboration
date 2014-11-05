package com.collaboration.java.service.project;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.collaboration.java.dao.project.ProjectDaoMySqlImpl;
import com.collaboration.java.dao.project.ProjectDao;
import com.collaboration.java.dto.CollaborationProjectDTO;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectDao projDao;
	
	@Override
	public CollaborationProjectDTO addProject(String name, String desc,
			Long started_by, String created_by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public CollaborationProjectDTO getProjectbyId(Long project_id) throws Exception{
		// TODO Auto-generated method stub
		return projDao.getProjectbyId(project_id);
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
	public void updateProject(Long project_id, String name, String desc,
			Long started_by, String created_by) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean deleteProject(Long project_id) {
		// TODO Auto-generated method stub
		return false;
	}

}
