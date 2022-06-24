package com.woongsun.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woongsun.domain.MemberVo;

import lombok.extern.log4j.Log4j;
import oracle.jdbc.proxy.annotation.Post;

@Controller
@RequestMapping("member")
@Log4j
public class MemberController {
	@GetMapping("login")
	public void login(@ModelAttribute String error,@ModelAttribute String logout) {
		
	}
	
	@GetMapping("join")
	public void join() {
		
	}
	
	@PostMapping("join")
	public void join(MemberVo vo) {
		log.info(vo);
	}
	
	@PreAuthorize("isFullyAuthenticated()")
	@GetMapping("mypage")
	public void mypage() {
		
	}
	@PostMapping
	public void mypage(MemberVo vo) {
		
	}
}
