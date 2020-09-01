package com.yzk.hqbx.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.yzk.hqbx.file.Fileupdate;
import com.yzk.hqbx.model.Student;
import com.yzk.hqbx.service.StudentService;

@Controller
@RequestMapping("/")
public class StudentControl {
	@Autowired
	private StudentService studentService;

	@RequestMapping("add")
	public String login(@RequestParam("file") MultipartFile file, Model model, Student student) {
		Fileupdate fileupdate = new Fileupdate();
		fileupdate.fileupdate(file);
		student.setImg(file.getOriginalFilename());
		studentService.add(student);
		model.addAttribute("list", studentService.findall());
		return "studentlist";
	}

	@RequestMapping("up")
	public String up(@RequestParam("file") MultipartFile file, Model model, Student student) {
		if (!file.isEmpty()) {
			Fileupdate fileupdate = new Fileupdate();
			fileupdate.fileupdate(file);
			student.setImg(file.getOriginalFilename());
		} else {
			student.setImg(studentService.getbyid(student.getId()).getImg());
		}
		studentService.up(student);
		model.addAttribute("list", studentService.findall());
		return "studentlist";
	}

	@RequestMapping("list")
	public String list(Model model) {
		model.addAttribute("list", studentService.findall());
		return "studentlist";
	}

	@RequestMapping("del")
	public String del(Model model, int id) {
		System.out.println(id + "_________________");
		studentService.del(id);
		model.addAttribute("list", studentService.findall());
		return "studentlist";
	}

	@RequestMapping("get")
	public String get(Model model, int id) {
		model.addAttribute("student", studentService.getbyid(id));
		return "upstudent";
	}
}
