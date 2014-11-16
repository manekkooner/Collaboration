package com.collaboration.java.ibatis.mapper;

import java.util.Date;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;
import org.apache.ibatis.annotations.MapKey;

import scala.annotation.meta.param;


import com.collaboration.java.dto.CollaborationProjectDTO;


public interface ProjectMapper {
	
	
	@Select(value= "{ CALL SP_GET_PROJECT_BY_ID( #{proj_id, mode=IN, jdbcType=BIGINT} )}")
	@Options(statementType = StatementType.CALLABLE)
	@Results(value = {
			@Result(property="project_id", column="PROJECT_ID"),
			@Result(property="name", column="NAME"),
			@Result(property="description", column="DESCRIPTION"),
	})
	CollaborationProjectDTO getProjectById(Long param);
	
	@Insert(value ="{CALL SP_INSERT_PROJECT( " +
			"#{name, mode=IN, jdbdType=VARCHAR}, " +
			"#{description, mode=IN, jdbcType=VARCHAR}," +
			"#{user_id, mode=IN, jdbcType=BIGINT}, " +
			"#{first_workflow_id, mode=IN, jdbcType=BIGINT} )}" )
	@Options(statementType = StatementType.CALLABLE)
	void addProject(CollaborationProjectDTO dto);
	

}
