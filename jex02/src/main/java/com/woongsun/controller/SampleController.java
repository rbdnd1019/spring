package com.woongsun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woongsun.domain.MemberVo;

import lombok.extern.log4j.Log4j;

@Controller 
@RequestMapping("/sample")
@Log4j
public class SampleController {
	@GetMapping("all")
	public void doAll() {
		log.info("do all can access");
	}

	@GetMapping("member")
	public void doMember() {
		log.info("member");
	}

	@GetMapping("admin")
	public void doAdmin() {
		log.info("admin");
	}
	
	@GetMapping("param")
	public void test() {
		
	}
	
	@PostMapping("param")
	public void test(MemberVo vo) {
		
	}
}
