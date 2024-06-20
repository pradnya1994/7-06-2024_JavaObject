package javaObjects;

public class StudentTestClass2 {

	public static void main(String[] args) 
	{
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();		
		
		s1.getStudentDetails();
		
		System.out.println();
		
		s2.getStudentDetails();
		
		System.out.println();
		
		s3.getStudentDetails();
		
		System.out.println("---------------------------------------");
		
		Student s11 = new Student(1234, "Pradnya", "BE", "Engineering", 7045F);
		Student s12 = new Student(2312, "Mukund", "B.tech CSE", "Computers", 89.45F);
		Student s13 = new Student(1234, "Raghav", "MBA Finance", "Finance", 67.88F);		
		
		s11.getStudentDetails();
		Student.getStudentCollegeName();
		
		System.out.println();
		
		s12.getStudentDetails();
		Student.getStudentCollegeName();
		
		System.out.println();
		
		s13.getStudentDetails();
		Student.getStudentCollegeName();
		
		
		
	}

}
