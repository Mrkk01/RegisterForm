package com.example.Form.RegisterForm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Form.RegisterForm.entity.StudentForm;

public interface StudentRepo extends JpaRepository<StudentForm,Integer>{

}
