package com.collaboration.java.dao.project;

import java.util.ArrayList;

import com.collaboration.java.dto.CollaborationProjectDTO;

public interface ProjectDao {
	
	public CollaborationProjectDTO addProject(String name, String desc, Long started_by, String created_by);
	public CollaborationProjectDTO getProjectbyId(Long project_id) throws Exception;
	public CollaborationProjectDTO getProjectbyName(String name);
	public ArrayList<CollaborationProjectDTO> getAllPojects();
	public void updateProject(Long project_id,String name, String desc, Long started_by, String created_by);
    public boolean deleteProject(Long project_id);
}
