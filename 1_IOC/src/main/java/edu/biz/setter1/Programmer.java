package edu.biz.setter1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Programmer implements Emp{

	@Override
	public void gotoOffice() {
		log.info("프로그래머 출근합니다.");
	}

	@Override
	public void getoOffWork() {
		log.info("프로그래머 퇴근합니다.");
	}
	
}
