package com.mydemo.myapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mydemo.myapp.pojo.AddRequest;

@RestController
@RequestMapping("/api")
public class AppController {
	/*
	 * http://localhost:8080/api/add
	 */
	
	@PostMapping("/add")
	public String addTwoNum(@RequestBody AddRequest request) {
		return "Sum("+request.getValue1()+","+request.getValue2()+")="+(request.getValue1()+request.getValue2());
	}
}
