package edu.biz.smallMart3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SmallMartApp3 {
	public static void main(String[] args) throws Exception  {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("small4.xml");
		
		
		SmallMart mart2 = ctx.getBean("mart", SmallMart.class);
		try {

			mart2.getProduct("생필품");
			mart2.getProduct2("전자제품");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
