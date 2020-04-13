package com.example.Radha;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Request {

	
	@RequestMapping("/ram")
	public String ab()
	{
		return "jaio=a=oa";
	}
}
