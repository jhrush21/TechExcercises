package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		String toReturn = "";

		toReturn += "Hello World! This message is part of Jake's merged branch!\n";
    		toReturn += "This is Travis' Branch\n";
		toReturn += "This is Daniel's Branch\n";

		return toReturn;
	}

}

