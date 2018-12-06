package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class StarterJSPTest {
	
	public static void main(String[] args) {
		SpringApplication.run(StarterJSPTest.class, args);
	}
	
	@RequestMapping("/")
	public String goIndex(Model model){
		return "index";
	}

}
