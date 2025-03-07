package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentInfoEntity;
import com.example.demo.service.IStudentService;

@RestController
@RequestMapping("/studentCtrl/service")
public class StudentRegistrationController {

	@Autowired
	IStudentService studentService;

	@GetMapping("/getAllStudent")
	List<StudentInfoEntity> getAllStudent() {
		return studentService.getAllStudents();

	}

	@GetMapping("/getStudent/{studentId}")
	List<StudentInfoEntity> getStudent(@PathVariable(value = "studentId") Long studentId) {
		return studentService.getAllStudents();

	}
	//	
	//	@GetMapping("/getStudent/{studentId}")
	//Optional<StudentInfoEntity> getStudent(@PathVariable(value = "studentId") Long studentId) {
	//		return studentService.getStudent(studentId);
	//
	//	}
	@PostMapping("/createStudent")
	StudentInfoEntity createStudent(@RequestBody StudentInfoEntity  studentInfoEntity) {
		return studentService.createStudent(studentInfoEntity);

	}

	@PutMapping("/updateStudent/{studentId}")
	StudentInfoEntity updateStudent(@PathVariable(value = "studentId") Long studentId, @RequestBody StudentInfoEntity  studentInfoEntity) {
		return	 studentService.updateStudent(studentInfoEntity,studentId);

	}
	@DeleteMapping("/deleteStudent/{studentId}")
	String deleteteStudent(@PathVariable(value = "studentId") Long studentId) {
		studentService.deleteStudent(studentId);
		return "Student Deleted Successfully!";

	}

}
