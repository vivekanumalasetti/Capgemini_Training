class JavaApplication{
	public static void execute() {
		Instagram user1 = new Instagram();
		user1.login("vivek","vivek@123");

		Instagram user2 = new Instagram();
		user2.login("vijay","vijay@gmail.com","vijay@123");	

		Instagram user3 = new Instagram();
		user3.login("rama@gmail.com",345678);

		Instagram user4 = new Instagram();
		user4.login(9876543210l,436587);	
	}
}