package com.yzk.hqbx.dao;

import java.util.List;

import com.yzk.hqbx.model.Student;

public interface StudentDao {
	Student getbyid(int id);

	List<Student> findall();

	void del(int id);

	void up(Student student);

	void add(Student student);
}
