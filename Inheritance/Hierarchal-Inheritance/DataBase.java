class DataBase {
	public String url;
	public String username;
	public String password;
	public void connection() {
		System.out.println("Database connection!");
	}
	public void disconnection() {
		System.out.println("Database disconnection");
	}
}