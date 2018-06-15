package com;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class NewStudentManagerDynamicProxy implements InvocationHandler {
    
	private Object targetObject;
	public Object newProxy(Object targetObject) {
		this.targetObject=targetObject;
		return targetObject;
		//Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		check();
		Object ret=null;
		ret=method.invoke(this.targetObject, args);
		return ret;
	}
	public void check() {
		System.out.println("check()");
	}

}
