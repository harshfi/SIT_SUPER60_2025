package Lec3;

public class Student {

	String name;
	int age;
	int roll;
	private int phn=91919191;
	
	public Student(String naam, int age,int roll) {
		this.name=naam;
		this.age=age;
		this.roll=roll;
	}
	
	public Student(String name) {
		this.name=name;
	}
	
	public static void fun() {
		System.out.println("yes he is funny");
	}
	public static void fun1() {
		System.out.println("harsh bhaiya ki dsa class");
	}
}
