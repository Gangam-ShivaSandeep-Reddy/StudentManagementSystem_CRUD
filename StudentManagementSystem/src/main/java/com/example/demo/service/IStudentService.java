package com.example.demo.service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.StudentInfoEntity;

public interface IStudentService {
	//
	//	StudentInfoEntity createStudent(StudentInfoEntity studentInfoEntity);
	//
	//	List<StudentInfoEntity> getAllStudents();
	//
	//	StudentInfoEntity updateStudent(StudentInfoEntity studentInfoEntity, Long studentId);



	void deleteStudent(Long studentId);

	//	StudentInfoEntity updateStudent(StudentInfoEntity studentInfoEntity, Long studentId);
	//@GetMapping
	//	StudentInfoEntity updateStudent(StudentInfoEntity studentInfoEntity, Long studentId);

	StudentInfoEntity updateStudent(StudentInfoEntity studentInfoEntity, Long studentId);

	StudentInfoEntity createStudent(StudentInfoEntity studentInfoEntity);

	List<StudentInfoEntity> getAllStudents();

}
