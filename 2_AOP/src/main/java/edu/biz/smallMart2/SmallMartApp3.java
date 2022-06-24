package edu.biz.smallMart2;

import java.lang.reflect.Method;

import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.biz.smallMart.advice.AfterRetLog;
import edu.biz.smallMart.advice.AroundLog;
import edu.biz.smallMart.advice.BeforeLog;
import edu.biz.smallMart.advice.ThrowsLog;

public class SmallMartApp3 {
	public static void main(String[] args) throws Exception  {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("small2.xml");
		
		
//		SmallMart mart1 = ctx.getBean("mart1", SmallMart.class);
		SmallMart mart2 = ctx.getBean("mart2", SmallMart.class);
		try {
//			
//			mart1.getProduct("생필품");
//			mart1.getProduct2("전자제품");
//			
			mart2.getProduct("생필품");
			mart2.getProduct2("전자제품");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
