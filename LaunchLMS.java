package com.oops.lms;

import java.util.Scanner;

public class LaunchLMS {
	

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Program Started --> ");
			
			Student s1 = new Student("Instacks at Destination", "2.0.7V", 
					"Full Stack Java", 5,"Mr. Sharath", 
					5, "Mastan", 17);
		
			s1.studentId = "00112345";
			
			System.out.println(" ");
			s1.displayInfo();
		
			
			s1.setEmail("mastan@unknown.com");
			System.out.println("Email is: " + s1.getEmail());
			s1.setPassword("Mastan0random56");
			System.out.println( "The Password is: "+s1.getPassword());
			System.out.println(" ");
			
		
			System.out.println("=========== Please do your Student Log in ===========");
			System.out.print("Enter your email: ");
			String Email = sc.nextLine();
			System.out.print("Enter your password: ");
			String pass = sc.nextLine();
			s1.login(Email, pass);
			
			System.out.println("<-- Program Ended");
		
		  }	
}
