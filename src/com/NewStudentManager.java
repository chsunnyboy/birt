package com;

public interface NewStudentManager {
	public void addNewStudent(String name,String password);
	public void updateStudent(int id,String name,String password);
	public void deleteStudent(int id);
	public String selectStudent(int id);
}
