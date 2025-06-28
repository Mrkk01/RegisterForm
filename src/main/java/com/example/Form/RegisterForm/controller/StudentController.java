package com.example.Form.RegisterForm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Form.RegisterForm.entity.StudentForm;
import com.example.Form.RegisterForm.repo.StudentRepo;

@RestController
@CrossOrigin
public class StudentController {
	@Autowired
	StudentRepo repo;
	@PostMapping("/add")
	public ResponseEntity<StudentForm> addStudents(@RequestBody StudentForm studentForm){
		repo.save(studentForm);
		
		return new ResponseEntity<StudentForm>(studentForm,HttpStatus.CREATED);
	}
}
