//package com.springMvcDay1.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class TestController {
//	
//	// Send Data from controller to view(jsp file)
//	 // Model 
//	
//    
//	@RequestMapping("/home")
//	public String home(Model model) {
//		System.out.println("this is home uri");
//		model.addAttribute("name", "Suren kr");
//		model.addAttribute("id", 110);
//		
//		  List<String> friends= new ArrayList<String>();
//		  friends.add("Roma");
//		  friends.add("Punita");
//		  friends.add("Asmi");
//		  
//		  model.addAttribute("fr", friends);
//		
//		
//		return "hello"; //->as jsp file
//	}
//	
//	@RequestMapping("/about")
//	public String about() {
//		return "about";
//	}
//	
//	
//	
//	  
//
//}
