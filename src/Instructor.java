package com.oops.lms;

public class Instructor extends Course{
	
	String instructorName;
	int experience;
	
	
	Instructor(String platformName, String platformVersion, 
			String courseName,int duration,String instructorName, 
			int experience){
		super(platformName, platformVersion, courseName,duration );
		this.instructorName = instructorName;
		this.experience = experience;
		System.out.println("This is Constructor for Instructor");
	}
	
	@Override // from course
	void displayInfo() {
		System.out.println("Instructor Name" + instructorName);
		System.out.println("Instructor Experience" + experience);
		System.out.println("Specialized in " + courseName);

	}
	
	// implemented abstract method in child class (which is must)
	void login() {
		System.out.println("The Instructor is logged in");
	}

}
