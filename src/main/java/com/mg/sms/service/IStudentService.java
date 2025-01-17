package com.mg.sms.service;

import java.util.List;

import com.mg.sms.entity.Student;

public interface IStudentService {
	
	List<Student> getAllStudents();
	
	public Student saveStudent(Student student);
	
	public Student getStudentById(Long id);
	
	public Student updateStudent(Student student);

	public void deleteStudentById(Long id);
}
