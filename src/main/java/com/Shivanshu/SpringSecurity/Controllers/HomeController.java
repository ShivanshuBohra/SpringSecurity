package com.Shivanshu.SpringSecurity.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String getWelcomePage() {
		return ("<h1>WELCOME<h1>");
	}
}
