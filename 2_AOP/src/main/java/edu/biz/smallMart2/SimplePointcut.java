package edu.biz.smallMart2;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class SimplePointcut extends StaticMethodMatcherPointcut{

	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		return method.getName().equals('2') && targetClass == SimplePointcut.class;
	}
	
	

}
