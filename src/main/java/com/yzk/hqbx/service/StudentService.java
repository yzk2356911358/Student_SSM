package com.yzk.hqbx.service;

import java.util.List;

import com.yzk.hqbx.model.Student;

public interface StudentService {
	Student getbyid(int id);

	List<Student> findall();

	void del(int id);

	void up(Student student);

	void add(Student student);
}
