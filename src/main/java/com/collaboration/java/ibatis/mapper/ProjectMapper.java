package com.collaboration.java.ibatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.collaboration.java.dto.CollaborationProjectDTO;


public interface ProjectMapper {
	
	@Select("SELECT * FROM COLLABORATION_PROJECT WHERE PROJECT_ID = #{project_id}")
    public CollaborationProjectDTO selectPerson(@Param("project_id") Long id);

}
