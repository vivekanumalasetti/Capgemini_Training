class Student1 {
	int id;
	String name;
	String emailId;
	long contactNumber;
	{
		id = 1;
		name = "Vivek";
		emailId = "vivek@gmail.com";
		contactNumber = 9876543210;
	}
	static String city;
	static String state;
	static String country;
	static {
		city = "Benglure";
		state = "Karnataka";
		country = "India";
	}

	public static void DisplayStudentDetails() {
		System.out.println("Student Id : " + id);
		System.out.println("Student Name : " + name);
		System.out.println("Student Email Id : " + emailId);
		System.out.println("Student Contact Number : " + contactNumber);
		
	}
}