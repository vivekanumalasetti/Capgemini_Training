class JavaApplication{
	public static void execute() {
		Oracle oracle = new Oracle();
		oracle.url = "www.oracle.com";
		oracle.username = "Vivek";
		oracle.password = "vivek@123";
		oracle.displayOracleDBInfo();
		oracle.connection();
		oracle.disconnection();
		oracle.crudOperation();

		MySql mysql = new MySql();
		mysql.url = "www.mysql.com";
		mysql.username = "Vijay";
		mysql.password = "vijay@123";
		mysql.displayMySqlDBInfo();
		mysql.connection();
		mysql.disconnection();
		mysql.crudOperation();

	}
}