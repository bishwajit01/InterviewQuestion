package interview.hpe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Question2 {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Bishwajit", "Bengaluru", 6);
		Student s3 = new Student("Vikram", "Bhagalpur", 16);
		Student s4 = new Student("Bishwajit Vikram", "India", 61);
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		
		
		studentList.sort(Comparator.comparingInt(Student::getAge).reversed());
		System.out.println(studentList.get(0).getName());
		
	}

}

class Student {
	
	private String name;
	private String city;
	private int age;

	public Student() {

	}

	public Student(String name, String city, int age) {
		this.name = name;
		this.city = city;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}