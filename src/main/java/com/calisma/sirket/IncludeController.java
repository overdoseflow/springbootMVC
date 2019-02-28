package com.calisma.sirket;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Properties.ButtonsProperty;

@Controller
public class IncludeController {
	
	//heade
	@RequestMapping(value = "/header", method = RequestMethod.GET)
	private String header(Model model) {

		ButtonsProperty  b1 = new ButtonsProperty();
		b1.setTitle("Anasayfa");
		b1.setUrl("/");
		
		
		ButtonsProperty  b2 = new ButtonsProperty();
		b2.setTitle("Hakkımızda");
		b2.setUrl("/user/10/11");
		
		
		List<ButtonsProperty> bls = new ArrayList<ButtonsProperty>();
		bls.add(b1);
		bls.add(b2);
		
		model.addAttribute("btn", bls);
		
		return "inc/header";
	}

}
