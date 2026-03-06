class JavaApplicationPC {
	public static void execute() {
		
		Parent p = new Parent();
		System.out.println(p instanceof Parent);
		System.out.println(p instanceof Child);

		Child c = new Child();
		System.out.println(c instanceof Child);
		System.out.println(c instanceof Parent);
	}
}