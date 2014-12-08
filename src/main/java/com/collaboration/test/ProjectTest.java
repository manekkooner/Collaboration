package com.collaboration.test;

import org.springframework.web.client.RestTemplate;

import com.collaboration.java.dto.CollaborationProjectDTO;

public class ProjectTest {


	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		String SERVER_URI = "http://localhost:8080/java/project/insert";
		CollaborationProjectDTO input = new CollaborationProjectDTO();
		input.setName("Billion");
		input.setDescription("Make the second billion");
		Long u_id =1l;
		input.setUser_id(u_id);
		input.setFirst_workflow_id(1);
		restTemplate.postForObject(SERVER_URI, input, CollaborationProjectDTO.class);

	}

}
