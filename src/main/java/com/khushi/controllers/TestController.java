package com.khushi.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.khushi.dtos.StudentDto;

@Controller
public class TestController {

	@GetMapping("/act")
	public ModelAndView Process() {
		ModelAndView mav = new ModelAndView();
		
		StudentDto s1 = new StudentDto("khushi", "global", "kp@gmail.com", 22);
		StudentDto s2 = new StudentDto("riya", "ggits", "rp@gmail.com", 16);
		StudentDto s3 = new StudentDto("rudra", "jec", "rrp@gmail.com", 11);
		StudentDto s4 = new StudentDto("pihu", "ram", "pp@gmail.com", 07);
		
		List<StudentDto> students = Arrays.asList(s1,s2,s3,s4);
		
		mav.addObject("student", students);
		mav.setViewName("next");
		return mav;
	}

}
