package com.collaboration.java.dao.project;

import java.util.ArrayList;
import java.util.Date;

import com.collaboration.java.dto.CollaborationProjectDTO;

public interface ProjectDao {
	
	public void addProject(CollaborationProjectDTO dto) throws Exception;
	public CollaborationProjectDTO getProjectbyId(Long project_id) throws Exception;
	public CollaborationProjectDTO getProjectbyName(String name);
	public ArrayList<CollaborationProjectDTO> getAllPojects();
	public void updateProject(Long project_id,String name, String desc, Long started_by, Date created_dt);
    public boolean deleteProject(Long project_id);
}
