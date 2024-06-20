package javaObjects;

public class Student 
{

	private int studentRollNo;
	private String studentName;
	private String studentClass;
	private String studentDepartment;
	private float studentMarks;
	
	//static fields
	public static String studentCollegeName;
	
	//static block
	static
	{
		studentCollegeName = "Cummins College";
	}
	
	public Student()
	{
		//static initialization
		studentRollNo = 1111;
		studentName = "Mukund";
		studentClass = "B.E 1st Year";
		studentDepartment = "IT";
		studentMarks = 63.70F;
	}
	
	
	//parameterized constructor
	public Student(int studentRollNo, String studentName, String studentClass, String studentDepartment, float studentMarks) 
	{
		this.studentRollNo = studentRollNo;
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.studentDepartment = studentDepartment;
		this.studentMarks = studentMarks;
	}

	//non-static method
	public Student getStudentDetails()
	{
		
		System.out.println(studentRollNo);
		System.out.println(studentName);
		System.out.println(studentClass);
		System.out.println(studentDepartment);
		System.out.println(studentMarks);
		
		return null;
	}
	
	//static method
	public static void getStudentCollegeName()
	{
		System.out.println(studentCollegeName);
	}

}
