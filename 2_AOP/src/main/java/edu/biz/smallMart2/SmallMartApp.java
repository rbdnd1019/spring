package edu.biz.smallMart2;

import org.springframework.aop.framework.ProxyFactory;

import edu.biz.smallMart.advice.AfterRetLog;
import edu.biz.smallMart.advice.AroundLog;
import edu.biz.smallMart.advice.BeforeLog;
import edu.biz.smallMart.advice.ThrowsLog;

public class SmallMartApp {
	public static void main(String[] args)  {
		SmallMart mart1 = new SmallMartImpl();
		
		try {
			mart1.getProduct("아아");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("============");
		ProxyFactory pf = new ProxyFactory();
//		pf.addAdvice(new AfterRetLog());
		pf.addAdvice(new AroundLog());
//		pf.addAdvice(new BeforeLog());
//		pf.addAdvice(new ThrowsLog());
		pf.setTarget(mart1);
		
		SmallMart mart2 = (SmallMart) pf.getProxy();
		try {
			mart2.getProduct2("아아아");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
