package com.yzk.hqbx.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yzk.hqbx.dao.StudentDao;
import com.yzk.hqbx.model.Student;
import com.yzk.hqbx.service.StudentService;

@Service
public class StudentServiceimp implements StudentService {
	@Autowired
	private StudentDao studentDao;

	public Student getbyid(int id) {
		return studentDao.getbyid(id);
	}

	public List<Student> findall() {
		return studentDao.findall();
	}

	public void del(int id) {
		studentDao.del(id);
	}

	public void up(Student student) {
		studentDao.up(student);
	}

	public void add(Student student) {
		studentDao.add(student);
	}

}
