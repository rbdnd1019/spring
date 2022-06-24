package edu.biz.ioc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderMangerApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ioc1.xml");
		OrderManager manger = ctx.getBean("orderManager", OrderManager.class);
		manger.order();
		ctx.close();
	}
}
