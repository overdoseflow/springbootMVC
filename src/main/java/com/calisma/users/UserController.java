package com.calisma.users;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	@RequestMapping(value = "/user/{id}/{kid}", method = RequestMethod.GET)
	public String userProfile(@PathVariable String id, @PathVariable String kid, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("kid", kid);
		System.out.println("Gelen id : " + id + " kid : " + kid);
		return "users/user";
	}

}
