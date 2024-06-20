package javaObjects;

public class StudentTestClass1 {

	public static void main(String[] args) 
	{
		int value = 50;
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		
	}

}
