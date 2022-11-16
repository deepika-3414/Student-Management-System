package com.myownprojects.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myownprojects.sms.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {
	

}
