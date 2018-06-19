package com;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		NewStudentManagerImpl nsmi=new NewStudentManagerImpl();
		NewStudentManagerDynamicProxy handler=new NewStudentManagerDynamicProxy();
		handler.newProxy(nsmi);
//		NewStudentManagerDynamicProxy handler=new NewStudentManagerDynamicProxy(nsmi);
		NewStudentManager newStudentManagerImpl=(NewStudentManager) Proxy.newProxyInstance(handler.getClass().getClassLoader(), nsmi.getClass().getInterfaces(), handler);
		newStudentManagerImpl.addNewStudent("chengqiu", "123456");
		newStudentManagerImpl.deleteStudent(1);
		newStudentManagerImpl.updateStudent(1, "zhangsan", "888888");
		newStudentManagerImpl.selectStudent(1);
	}

}
