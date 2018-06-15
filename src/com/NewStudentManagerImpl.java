package com;

public class NewStudentManagerImpl implements NewStudentManager {

	@Override
	public void addNewStudent(String name, String password) {
		System.out.println("NewStudentManager.addNewStudent");

	}

	@Override
	public void updateStudent(int id, String name, String password) {
		System.out.println("NewStudentManager.updateStudent");

	}

	@Override
	public void deleteStudent(int id) {
		System.out.println("NewStudentManager.deleteStudent");

	}

	@Override
	public String selectStudent(int id) {
		System.out.println("NewStudentManager.selectStudent");
		return null;
	}

}
