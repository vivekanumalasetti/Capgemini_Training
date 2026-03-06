class JavaApplication {
	public static void execute() {
		System.out.println(Sub.sv);
		Sub.sm();
		Sub sub = new Sub();
		System.out.println(sub.nsv);
		sub.nsm();
	}
}