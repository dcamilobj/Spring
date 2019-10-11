package com.udemy.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		// Create a new student object 
		Student theStudent = new Student();
		
		model.addAttribute("student",theStudent);
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student thStudent) {
		System.out.println("The student: " + thStudent.getFirstName() + " " +
	 thStudent.getLastName());
		return "student-confirmation";
	}
}
