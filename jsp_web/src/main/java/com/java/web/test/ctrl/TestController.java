package com.java.web.test.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("index")
	public String index() {
		System.out.println(">>> controller index");
		return "index";
	}

}
