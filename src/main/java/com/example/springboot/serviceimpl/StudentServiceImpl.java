package com.example.springboot.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.springboot.model.Student;
import com.example.springboot.repositry.StudentRepositry;
import com.example.springboot.service.StudentService;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
	private StudentRepositry studentRepositry;

	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepositry.save(student);
	}

}
