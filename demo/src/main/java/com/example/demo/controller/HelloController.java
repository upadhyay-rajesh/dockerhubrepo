package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("allEmp")
	public List<String> allEmp(){
		List<String> ll=Arrays.asList("Ramesh","Mahesh","Suresh");
		return ll;
	}

}
