package com.HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@Autowired
	Hello a;
	@GetMapping("hello")
	public String sayHello() {
		return a.hello();
	}
	
}
