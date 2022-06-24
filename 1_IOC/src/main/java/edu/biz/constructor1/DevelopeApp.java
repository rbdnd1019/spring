package edu.biz.constructor1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DevelopeApp {
	static Develope develope;
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("const.xml").getBean("develope", Develope.class).coding();
	}
}
