class Student{
	int id;
	String name;
	String mailId;
	Long contactNumber;
	Static String city;
	Static String state;
	Static String country;
	public void displayStudentDetails() {
		System.out.println("Student Details");
		System.out.println("---------------");
		System.out.println("Student Id : " + id);
		System.out.println("Student Name : " + name);
		System.out.println("Student MailId : " + mailId);
		System.out.println("Student contactNumber : " + contactNumber);
		System.out.println("Student city " + city);
		System.out.println("Student State : " + state);
		System.out.println("Student Country : " + country);
		System.out.println();
	}
}