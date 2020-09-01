package com.yzk.hqbx.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yzk.hqbx.model.User;

@Controller
@RequestMapping("/")
public class LoginControl {

	@RequestMapping("login")
	public String login(Model model, User user, String type) {
		if ("admin".equals(user.getUsername()) && "admin".equals(user.getPassword())) {
			return "home";
		}
		return "login";
	}
}
