package Compare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparablee{	
	public static void main(String[] args) {
		
	
	List<Student> studs= new ArrayList<>();
	studs.add(new Student(21,"Navin"));
	studs.add(new Student(12,"John"));
	studs.add(new Student(18,"Parul"));
	studs.add(new Student(20,"Kiran"));
	Collections.sort(studs);
	System.out.println(studs);
	
	// Collections.sort(al,new Student1(0, null));  
	}
}


class Student implements Comparable<Student>{
	int age;
	String name;
	
	public Student(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
	public String toString() {
		return "Student [age=" + age + ", name=" +name +"]";
	}
	
	@Override
	public int compareTo(Student that) {
		if(this.age >that.age)
			return 1;
		else
			return -1;
	
}}




class Student1 implements Comparator<Student>{
	int age;
	String name;
	
	public Student1(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
	public String toString() {
		return "Student [age=" + age + ", name=" +name +"]";
	}
	
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.age >o2.age)
			return 1;
		else
			return -1;
	}}