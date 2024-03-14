package com.LMS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAppClass {
	
	@GetMapping("/getName")
	public String getName() {
		return "anish";
	}

}
