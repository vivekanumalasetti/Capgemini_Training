class JavaApplication {
	public static void main(String[] args) {
		
		Student.city = "Jalandhar";
		Student.state = "Punjab";
		Student.country = "India";

		Student s1 = new Student();
		System.out.println("Student" + s1);
		s1.id = 1;
		s1.name = "Vivek";
		s1.mailId = "Vivek@gmail.com";
		s1.contactNumber = 1234567890;
		s1.displayStudentDetails();



		Student s2 = new Student();
		System.out.println("Student" + s2);
		s2.id = 2;
		s2.name = "Vijay";
		s2.mailId = "Vijay@gmail.com";
		s2.contactNumber = 1234567891;
		s2.displayStudentDetails();

	}
}