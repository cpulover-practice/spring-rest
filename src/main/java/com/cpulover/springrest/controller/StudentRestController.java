package com.cpulover.springrest.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpulover.springrest.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	private List<Student> studentList = new ArrayList<Student>();

	// define @PostConstruct to load the student data only once
	@PostConstruct
	public void loadData() {
		studentList.add(new Student("Justa1", "Cpulover1"));
		studentList.add(new Student("Justa2", "Cpulover2"));
		studentList.add(new Student("Justa3", "Cpulover3"));
	}

	// define endpoint for "/students" - return list of students
	@GetMapping("/students")
	public List<Student> getStudents() {
		return studentList;
	}

	// define endpoint for "/students/{index}" - return student at index
	@GetMapping("/students/{index}")
	public Student getStudent(@PathVariable int index) {
		return studentList.get(index);
	}
}
