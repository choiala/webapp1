package com.mycompany.webapp.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ch06") //공통 경로
public class Ch06Controller {
	private static final Logger logger = 
			LoggerFactory.getLogger(Ch06Controller.class);
	
	@GetMapping("/content")
	public String content() {
		logger.info("실행");
		return"ch06/content";
	}
	
	@GetMapping("/forward")
	public String forward() {
		logger.info("실행");
		return "ch06/forward";
	}
	
	@GetMapping("/redirect")
	public String redirect() {
		logger.info("실행");
		return "redirect:/ch06/content"; //앞,뒤로 /WEB~, .jsp안붙음
	}
	
	@GetMapping("/login")
	public String login() {
		logger.info("로그인 성공");
		return "redirect:/ch05/content";
		
	}
	
	@GetMapping("/boardWrite")
	public String boardWrite() {
		logger.info("게시물 저장 성공");
		return "redirect:/ch06/boardList";
		//처음엔 boardWrite로 요청했지만 성공 후에는 boardList에 접속해야해
	}
	
	@GetMapping("/boardList")
	public String boardList() {
		logger.info("게시물 저장 성공");
		return "ch06/boardList";	
	}
}