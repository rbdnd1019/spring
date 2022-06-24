package edu.biz.smallMart2;

import java.lang.reflect.Method;

import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import edu.biz.smallMart.SmallMart;
import edu.biz.smallMart.SmallMartImpl;
import edu.biz.smallMart.advice.AfterRetLog;
import edu.biz.smallMart.advice.AroundLog;
import edu.biz.smallMart.advice.BeforeLog;
import edu.biz.smallMart.advice.ThrowsLog;

public class SmallMartApp2 {
	public static void main(String[] args)  {
		SmallMart mart1 = new SmallMartImpl();
		
		
		
		System.out.println("============");
		ProxyFactory pf = new ProxyFactory();
		
		AspectJExpressionPointcut apc = new AspectJExpressionPointcut();
		apc.setExpression("execution(* *2(..))");
		
		pf.addAdvisor(new DefaultPointcutAdvisor(apc, new BeforeLog()));
		pf.setTarget(mart1);
		
		SmallMart mart2 = (SmallMart) pf.getProxy();
		try {
			mart2.getProduct("생필품");
			mart2.getProduct("전자제품");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
