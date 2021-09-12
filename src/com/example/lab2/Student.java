package com.example.lab2;
import java.util.List;
import java.util.ArrayList;

public class Student implements Comparable<Student>
{
	int no;
	String name;
	int age;
	
	@Override
	public String toString() 
	{
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
	public Student(int no, String name, int age)
	{
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	public int getNo() 
	{
		return no;
	}
	public void setNo(int no) 
	{
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Student o)
	{
		//return Integer.compare(age, o.age);
		//return Integer.valueof(age).compareTo(o.age);
		return name.compareTo(o.name);
	}
}
