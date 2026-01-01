public class Student extends Instructor {
	
	String studentName;
	String studentId;
	int rollNo;
    private String email;
    private String password;
    
	Student(String platformName, String platformVersion, 
			String courseName,int duration,String instructorName, 
			int experience, String studentName, int rollNo){
		super(platformName, platformVersion, courseName,duration, 
				instructorName, experience);
		this.studentName = studentName;
		this.rollNo = rollNo;
		System.out.println("This is Constructor for Student");
		
	}
	
	@Override //from Instructor
	void displayInfo() {
		System.out.println("=========== Student details ===========");
		System.out.println("Student Name: " + studentName);
		System.out.println("Student Id: " + studentId);
		System.out.println("Course enrolled: " + courseName);
		System.out.println("Course instructor: " + instructorName);
		System.out.println("LMS version using: " +platformVersion);

	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	
	void login(String Email, String pass) {
		if(email.equals(Email) && password.equals(pass))
		{
		System.out.println("Student has logged in to LMS Successfully");}
		else {
			System.out.println("Login credentials are invalid");
			return;
		}
	}
}
