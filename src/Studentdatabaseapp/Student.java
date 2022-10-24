package Studentdatabaseapp;
import java.util.Scanner;

public class Student {
	
	//Adding the attribute 
	private String firstName;
	private String LastName;
	private int gradeyear;
	private int studentID;
	private String courses;
	private String paymentbalance;
	private static int costofCourse = 20000;
	private static int id = 001;
	
	
	
	
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
		
		setstudentID();
		
		System.out.println(firstName+ " " +LastName+ " " +gradeyear+" "+ studentID);
		
		
		
		
	}
	
	
	//generate a ID
	private void setstudentID() {
		//Grade Level + ID
		id++;
		this.studentID =  id;
		
	}
	
	
	
	//Enroll to courses
	
	
	
	//View balance
	
	
	
	//Pay tuition
	
	
	//show status
	
	

}
