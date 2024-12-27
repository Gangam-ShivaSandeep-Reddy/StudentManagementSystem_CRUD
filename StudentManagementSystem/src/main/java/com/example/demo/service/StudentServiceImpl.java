package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentInfoEntity;
import com.example.demo.repo.StudentRegRepo;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {

	@Autowired
	StudentRegRepo studentRegRepo;

	@Override
	public StudentInfoEntity createStudent(StudentInfoEntity studentInfoEntity) {

		return studentRegRepo.save(studentInfoEntity);
	}

	@Override
	public List<StudentInfoEntity> getAllStudents() {

		return studentRegRepo.findAll();
	}

	public Optional<StudentInfoEntity> getStudent(long studentId ) {

		return studentRegRepo.findById(studentId);
	}
	//@Override
	public StudentInfoEntity updateStudent(StudentInfoEntity studentInfoEntity,Long studentId) {
		studentInfoEntity.setStudentId(studentId);
		return studentRegRepo.save(studentInfoEntity);
	}


	public void deleteStudent(Long studentId) {

		studentRegRepo.deleteById(studentId);
	}


}
