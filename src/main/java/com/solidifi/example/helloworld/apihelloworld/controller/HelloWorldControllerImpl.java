package com.solidifi.example.helloworld.apihelloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.solidifi.example.helloworld.apihelloworld.model.Hello;

@RestController
public class HelloWorldControllerImpl implements HelloWorldController{

	@Override
    @RequestMapping("/greeting")
	public Hello sayHi(@RequestParam(value="name", defaultValue="Noone")String name, 
			@RequestParam(value="text", defaultValue="Nothing")String text) {
		Hello hello = new Hello();
		hello.setName(name);
		hello.setText("Requestor says: " + text);
		return hello;
	}

}
