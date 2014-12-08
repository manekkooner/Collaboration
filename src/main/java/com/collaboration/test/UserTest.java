package com.collaboration.test;

import java.util.Date;

import org.springframework.web.client.RestTemplate;

import com.collaboration.java.dto.CollaborationUserDTO;

public class UserTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		String SERVER_URI = "http://localhost:8080/java/user/insert";
		CollaborationUserDTO input = new CollaborationUserDTO();
		input.setFirst_name("Prabh Manek");
		input.setLast_name("Kooner");
		input.setActive(true);
		input.setEmail_id("pmskooner@gmail.com");
		input.setUser_education_id(0);
		input.setUser_work_id(0);
		input.setUser_type_id(1);
		restTemplate.postForObject(SERVER_URI, input, CollaborationUserDTO.class);
		System.out.println("Completed");

	}

}
