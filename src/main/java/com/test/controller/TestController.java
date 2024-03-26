package com.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/test")
public class TestController {

	@GetMapping
	public ResponseEntity<?> test(){
		// 只要有錯誤的數值就返回去
//		if (bindingResult.hasErrors()) {
//			return ResponseEntity.status(400).body(bindingResult.getAllErrors());
//		}
		return ResponseEntity.ok("test ok");
	}
}
