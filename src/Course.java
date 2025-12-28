package com.oops.lms;

public abstract  class Course extends Platform {
	
	String courseName;
	String courseId;
	int duration;
	
	Course(String platformName, String platformVersion,String courseName,int duration ){
		super(platformName, platformVersion);// super --> it calls the constructor of parent class
		
		 this.courseName = courseName;
		 this.duration =duration;
		System.out.println("This is course Constructor for " + courseName);
	}
	
	@Override // from parent Platform class
	void displayInfo(){
		System.out.println("Course Name: " + courseName);
		System.out.println("Course Id: " + courseName);
		System.out.println("Course Duration: " + courseName + "Months");
	}
	
	abstract void login();
}
