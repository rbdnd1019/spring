package edu.biz.smallMart3;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component @Aspect
public class smallMartAdvice {
	@Before("execution(* *2(..))")
	public void smallBefore(JoinPoint jp) {
		System.out.println("사전 :: " + jp.getSignature().getName());
	}
	
	public void adv(){
		System.out.println("사전2");
	}
	
	public void logging(JoinPoint jp) {
		System.out.printf("[%s.%s(%s) :: %s] - ",
				jp.getTarget().getClass().getName(),
				jp.getSignature().getName(),
				Arrays.toString(jp.getArgs()),
				new SimpleDateFormat("yyyy-MM-dd hh:mma").format(System.currentTimeMillis()));
	}
}
