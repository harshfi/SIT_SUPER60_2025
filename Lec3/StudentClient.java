package Lec3;

public class StudentClient {

	public static void main(String[] args) {
		
		Student s= new Student("harsh",22,1);
        System.out.println(s.name);
        Student s1= new Student("Degvijay",55,2);
        System.out.println(s1.age);
       
	}
	static {
		System.out.println("Hi im in harsh bhaiya class");
	}

}
