package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Programmer;
import com.example.demo.service.ProgrammerServiceImpl;

@RestController
@RequestMapping("programmers")
public class ProgrammerController {
	@Autowired
	ProgrammerServiceImpl service;
	
	@PostMapping("")
	public Programmer addProgrammer(@RequestBody Programmer programmer) {
		return service.addProgrammer(programmer);
	}
}
