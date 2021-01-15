package com.mycompany.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.mycompany.webapp.dto.Ch09User;

@Controller
@RequestMapping("/ch09")
public class Ch09Controller {
	private static final Logger logger = 
			LoggerFactory.getLogger(Ch09Controller.class);
	
	@GetMapping("/content")
	public String content() {
		logger.info("실행");
		return "ch09/content";
	}
	
	@PostMapping("/fileupload")
	public String fileupload(Ch09User user) {
		//문자 파트 정보 얻기
		String uid = user.getUid();
		String uname = user.getUname();
		String upassword = user.getUpassword();
		logger.info("uid: " + uid);
		logger.info("uname: " + uname);
		logger.info("upassword: " + upassword);
		
		//파일파트 정보 얻기
		MultipartFile uphoto = user.getUphoto();
		String originalFileName = uphoto.getOriginalFilename();
		String contentType = uphoto.getContentType();
		long size = uphoto.getSize();
		logger.info("originalFileName: " + originalFileName);
		logger.info("contentType: " + contentType);
		logger.info("size: " + size);
		
		//파일 경로
		String savDirPath = "D:/Myworkspace/uploadfiles/";
		
		return "redirect:/ch09/content";
	}
}
