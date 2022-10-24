package Studentdatabaseapp;
import java.util.Scanner;

public class Student {
	
	//Adding the attribute 
	private String firstName;
	private String LastName;
	private int gradeyear;
	private int studentID;
	private String[] courses= new String[10];
	private int paymentbalance = 0;
	private static int costofCourse = 20000;
	private static int id = 001;
	private int coursecount = 0;
	
	
	
	
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
	public void enroll() {
		//inside loop , user hit 0
		
		System.out.println("Enter Course to enroll (Q to quit)");
		System.out.println("1.Information Technology\n 2.Cyber Security\n 3.Bussness Management\n 4.Software Engineering ");
		
		Scanner Sc = new Scanner(System.in);
		
		String courses = Sc.nextLine();
		while(courses != "Q") {
			courses = courses+"\n"+courses;
			 paymentbalance =  paymentbalance + costofCourse;
			 coursecount ++;
			 
			 
			 
			
		}
		System.out.println("ENROLLED IN: "+courses);
		System.out.println("TOTAL BALANCE: "+paymentbalance);
		
	}
	
	
	//View balance
	
	
	
	//Pay tuition
	
	
	//show status
	
	

}
