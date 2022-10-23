package Studentdatabaseapp;
import java.util.Scanner;

public class Student {
	
	//Adding the attribute 
	private String firstName;
	private String LastName;
	private int gradeyear;
	private int StudentID;
	private String courses;
	private String paymentbalance;
	private int costofCourse = 20000;
	
	
	
	//constructor : prompt user to enter student name and year
	//(Constructor Same as the Class name)
	public Student() {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter Student First Name : ");
		this.firstName = Sc.next();
		
		System.out.println("Enter Student Last Name : ");
		this.LastName = Sc.next();
		
		System.out.println("Enter Student Year (Ex. year1 = 1 / year2 = 2) : ");
		this.gradeyear = Sc.nextInt();
		
		System.out.println(firstName+" "+LastName+" "+gradeyear+" ");
	}
	
	
	//generate a ID
	
	
	
	//Enroll to courses
	
	
	
	//View balance
	
	
	
	//Pay tuition
	
	
	//show status
	
	

}
