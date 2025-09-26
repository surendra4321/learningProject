package com.springMvcDay1.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TodoController {
	 
	@Autowired
	ServletContext context;
	
	@RequestMapping("/home")
	public String home(Model m) {
		String str="home";
		m.addAttribute("page", str);
		   List<Todo> list= (List<Todo>) context.getAttribute("list");
		   m.addAttribute("todos", list);
		   System.out.println(list);
		return "home";
	} 
	
	@RequestMapping("/add")
	public String addTodo(Model m) {
		Todo t = new Todo();
		System.out.println(t);
		m.addAttribute("page", "add"); 
		m.addAttribute("todo", t);
		System.out.println(t);
		return "home";
	} 

	@RequestMapping(value="/saveTodo", method=RequestMethod.POST)
	public String saveTodo(@ModelAttribute("todo") Todo t, Model m) {
		 System.out.println(t);
	     t.setTodoDate(new Date());
	     //get the todo list from context
	     List<Todo> list= (List<Todo>) context.getAttribute("list");
	     list.add(t);
	     System.out.println(list);
	     m.addAttribute("msg","successfully added");
		return "home";
	} 

}
