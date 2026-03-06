class Student {

	//Blank final non static variables
	final int id;
	final String name;
	final String maidId;
	final long contactNumber;
	Student(int id, String name, String mailId, long contactNumber) {
		this.id = id;
		this.name = name;
		this.mailId = maidId;
		this.contactNumber = contactNumber;
	}

	//Blank final static variables
	static final String city;
	static final String state;
	static final String country;	
	static {
		city = "Jalander";
		state = "Punjab";
		country = "India";
	}
	
	public void displayStudentInfo() {
		// final int id = 1;
		// // id = 2;
		// String maidId = "Vivek@gmail.com";
		// maidId = "vivekanumalasetti@gmail.com";
		// System.out.println("Id : " + id);
		// System.out.println("MailId : " +maidId);
	}
}