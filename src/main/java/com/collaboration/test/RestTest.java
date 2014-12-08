package com.collaboration.test;

import org.springframework.web.client.RestTemplate;

import com.collaboration.java.dto.CollaborationProjectDTO;

import java.net.URI;


public class RestTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
        CollaborationProjectDTO page = restTemplate.getForObject("http://localhost:8080/java/project/insert/", CollaborationProjectDTO.class);

	}

}
