package com.example.demoRestEx;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeComtroller {
	
	/*
	 * @RequestMapping("home")
	 * 
	 * @ResponseBody public String home(String name) {
	 * System.out.println("Hi Home"); return "Hello "+name; }
	 */
	
	@RequestMapping("home")
	@ResponseBody
	public ModelAndView home(@RequestParam("name") String name ) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", name);
		mv.setViewName("home");
		System.out.println("Hi Home");
		return mv;
	}
	
	@RequestMapping("home1")
	@ResponseBody
	public ModelAndView home(Alien alien) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", alien);
		mv.setViewName("home");
		System.out.println("Hi Home");
		return mv;
	}

}
