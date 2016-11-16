package vn.smartdev.demo_aop.service;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class HijackBeforeMethod implements MethodBeforeAdvice {

	public void before(Method method, Object[] objects, Object object) throws Throwable {
		System.out.println("Do something before method is called");
	}

}
