package edu.biz.ioc4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderMangerApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ioc4.xml");
		OrderManager manger = (OrderManager)ctx.getBean("orderManager");
		System.out.println(manger);
		System.out.println(manger);
		System.out.println(manger);
		System.out.println(manger);
		System.out.println(manger);
		manger.order();
		ctx.close();
	}
}
