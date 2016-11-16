package vn.smartdev.demo_aop.service;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class HijackAfterMethod implements AfterReturningAdvice{

	public void afterReturning(Object object, Method metod, Object[] objects, Object obkect1) throws Throwable {
		System.out.println("Do something after method is called !");
	}

}
