package com.cgm.main;

public class Student {
	public String name;
	public String faculty;
	public int age;
	
	public Student(String name, String faculty, int age) {
		super();
		this.name = name;
		this.faculty = faculty;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", faculty=" + faculty + ", age=" + age + "]";
	}
	
	


}
