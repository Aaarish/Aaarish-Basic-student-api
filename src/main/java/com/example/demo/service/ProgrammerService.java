package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Programmer;
import com.example.demo.repository.ProgrammerRepo;

@Service
public class ProgrammerService {
	@Autowired
	ProgrammerRepo repo;
	
	public Programmer addProgrammer(Programmer programmer) {
		return repo.save(programmer);
	}

}
