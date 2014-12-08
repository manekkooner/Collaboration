package com.collaboration.java.ibatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;

import com.collaboration.java.dto.CollaborationUserDTO;

public interface UserMapper {
	
	
	@Insert(value ="{CALL SP_INSERT_USER( " +
			"#{first_name, mode=IN, jdbdType=VARCHAR}, " +
			"#{last_name, mode=IN, jdbcType=VARCHAR}," +
			"#{active, mode=IN, jdbcType=BOOLEAN}, " +
			"#{user_type_id, mode=IN, jdbcType=BIGINT}, " +
			"#{user_education_id, mode=IN, jdbcType=BIGINT}, " +
			"#{user_work_id, mode=IN, jdbcType=BIGINT}, " +
			"#{email_id, mode=IN, jdbcType=VARCHAR} )}" )
	@Options(statementType = StatementType.CALLABLE)
	void addProject(CollaborationUserDTO dto);

}
