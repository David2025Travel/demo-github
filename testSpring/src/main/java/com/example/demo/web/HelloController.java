package com.example.demo.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String hello(Model model) {
		SimpleDateFormat formatTime = new SimpleDateFormat("HH:MM:ss");
		String heure = formatTime.format(new Date());
		model.addAttribute("heure", heure);
		return "hello";
	}
}
