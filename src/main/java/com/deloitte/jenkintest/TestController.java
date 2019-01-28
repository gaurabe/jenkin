package com.deloitte.jenkintest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value="/test")
	public String firstApp() {
		return "My springBoot app is working on jenkins";
	}
}
