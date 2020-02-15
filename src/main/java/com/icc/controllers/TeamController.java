package com.icc.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class TeamController {

	@GetMapping("/team")
	public String home() {
		return "index";
	}
	
	
}
