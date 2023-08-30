package com.myapp.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HiHello {
	@GetMapping(value = "/himam")
	public String getMsg() {
		return "i am fine";
	}
}
