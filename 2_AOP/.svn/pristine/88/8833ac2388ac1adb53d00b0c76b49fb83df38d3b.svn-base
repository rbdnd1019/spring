package edu.biz.jdkproxy;

import java.lang.reflect.Proxy;

public class HelloWorldApp {
	public static void main(String[] args) {
		HellowWorld helloWorld1 = new HelloworldImpl();
		helloWorld1.sayHellow("원본객체");
		
		System.out.println("============================");
		HellowWorld helloWorld2 = (HellowWorld) Proxy.newProxyInstance(
				HellowWorld.class.getClassLoader(), new Class[] {HellowWorld.class}, new HelloworldHandler(helloWorld1));
		helloWorld2.sayHellow("대리객체");
		System.out.println("============================");
		System.out.println(helloWorld1);
		System.out.println(helloWorld2);
	}
}
