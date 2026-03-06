interface Interface {
	public static void sm() {
		System.out.println("It is a static method");
	}

	public default void nsm1() {
		System.out.println("It is a non-static method");
	}

	public void nsm2();
}