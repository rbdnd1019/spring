package com.woongsun.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woongsun.mapper.SampleMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SampleService {
	private SampleMapper mapper;
	
	@Transactional
	public void test(String str) {
		mapper.insert1(str);
		mapper.insert2(str);
	}
	
	public void test2(String str) {
		mapper.insert1(str);
		mapper.insert2(str);
	}
}
