class MySql extends DataBase {
	public void displayMySqlDBInfo() {
		System.out.println("MySql DB Info");
		System.out.println("--------------");
		System.out.println("URL : "+url);
		System.out.println("Username : " + username);
		System.out.println("Password : " + password);
		System.out.println();
	}

	public void crudOperation() {
		System.out.println("Programmer Generated Queries!");
	}
}