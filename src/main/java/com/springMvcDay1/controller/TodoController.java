package com.springMvcDay1.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {
	  
	@RequestMapping("/home")
	public String home(Model m) {
		String str="home";
		m.addAttribute("page", str);
		return "home";
	} 
	
	@RequestMapping("/add")
	public String addTodo(Model m) {
		Todo t = new Todo();
		m.addAttribute("page", "add"); 
		m.addAttribute("todo", t);
		return "home";
	} 

	@RequestMapping(value="/saveTodo", method=RequestMethod.POST)
	public String saveTodo(@ModelAttribute("todo") Todo t, Model m) {
		 System.out.println(t);
	     t.setTodoDate(new Date());
		return "home";
	} 

}
