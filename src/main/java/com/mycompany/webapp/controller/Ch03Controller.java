package com.mycompany.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ch03") //경로에 ch03이 들어가면 이 컨트롤러가 요청 처리를 하겠다
public class Ch03Controller {
	private static final Logger logger = 
			LoggerFactory.getLogger(Ch03Controller.class);
	
	@GetMapping("/content")
	public String conten() {
		logger.info("실행");
		return "ch03/content";
	}
}
