package com.example.demo;

import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

	public static void main(String[] args) throws Exception {
		ObjectMapper om = new ObjectMapper();
		om.readValue("[]", List.class);
	}
	
}
