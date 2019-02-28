package com.calisma.sirket;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Properties.Data;
import Properties.user;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("name", "Mehmet");
		model.addAttribute("userls", new Data().tblData());

		return "home";
	}

	@RequestMapping(value = "/dataAl", method = RequestMethod.POST)
	public String dataAl(@RequestParam String adi,
			@RequestParam String soyadi,
			@RequestParam (defaultValue ="") String futbol,
			@RequestParam(defaultValue ="") String yuzme,
			HttpServletRequest req) {
		System.out.println("adi " + adi);
		System.out.println("soyadi " + soyadi);
		System.out.println("futbol " + futbol);
		System.out.println("yuzme " + yuzme);
		
		
		if (req.getParameterValues("durum") != null) {
			String[] dizi = req.getParameterValues("durum");
			for (String item : dizi) {
				System.out.println("item " + item);
			}	
		}

		return "home";
	}
	
	@RequestMapping(value = "/dataPro", method = RequestMethod.POST)
	public String dataPro(user us) {
		System.out.println("name " + us.getName());
		System.out.println("surname " + us.getSurname());
		System.out.println("age " + us.getAge());
		return "home";
	}

	
	//matrix
	@RequestMapping(value = "/matrix/{filter}", method = RequestMethod.GET)
	public String matrix(@MatrixVariable(pathVar = "filter") Map<String, List<String>> matrix) 
	{
		Set<String> st = matrix.keySet();
		for (String key : st) {
			System.out.println(key + ": " + matrix.get(key));
		}
		return "home";
	}
	
}
