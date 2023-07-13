package com.snow.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")  //get방식
	public String home() {
		return "home"; //jsp파일명
	}
	


}
