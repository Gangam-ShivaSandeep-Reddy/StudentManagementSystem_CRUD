package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.StudentInfoEntity;

@Repository
public interface StudentRegRepo extends JpaRepository<StudentInfoEntity, Long> {

}


