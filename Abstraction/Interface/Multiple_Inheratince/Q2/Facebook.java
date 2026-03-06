class Facebook extends SoftwareApplication {
	@Override
	public void open() {
		System.out.println("Facebook open");
	}

	@Override
	public void signUp() {
		System.out.println("Facebook Signed Up");
	}	

	@Override
	public void singIn() {
		System.out.println("Facebook Signed In");
	}

	@Override
	public void singOut() {
		System.out.println("Facebook Signed Out");
	}		

	@Override
	public void close() {
		System.out.println("Facebook closed");
	}

}