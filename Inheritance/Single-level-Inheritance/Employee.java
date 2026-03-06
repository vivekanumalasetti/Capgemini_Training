class Employee {
	int id;
	String name;
	String mailId;
	long contactNumber;

	static String city;
	static String state;
	static String country;

	public static void entry() {
		System.out.println("Employee entered into the company");
	}

	public static void login() {
		System.out.println("Employee logged into the Office");
	}

	public static void shortBreak() {
		System.out.println("Employee went for Tea!");
	}

	public static void meeting() {
		System.out.println("Employee having a meeting");
	}

	public static void longBreak() {
		System.out.println("Employee went for Lunch!");
	}

	public static void task() {
		System.out.println("Employee doing task");
	}

	public static void reverseKT() {
		System.out.println("Employee went to explain about the task");
	}

	public static void logout() {
		System.out.println("Employee doing logout");
	}

	public static void exit() {
		System.out.println("Employee did exit");
	}

}