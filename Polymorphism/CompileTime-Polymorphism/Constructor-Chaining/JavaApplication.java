class JavaApplication{
	public static void execute() {

		Student student1 = new Student("Suresh",'M',"3/9/2003");
		student1.displayStudentInfo();

		Student student2 = new Student("Sohail",'M',"24/9/2003","sohail@gmail.com");
		student2.displayStudentInfo();

		Student student3 = new Student("Vivek",'M',"4/11/2004","vivek@gmail.com",9876543210l);
		student3.displayStudentInfo();
		
	}
}