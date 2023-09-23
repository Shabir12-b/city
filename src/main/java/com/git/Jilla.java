package com.git;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Jilla {
	@GetMapping(value="/getMap")
	public String getMap() {
		return "CHENNAI";
	}

}
