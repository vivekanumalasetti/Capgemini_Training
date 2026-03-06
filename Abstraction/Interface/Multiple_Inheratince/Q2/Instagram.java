class Instagram extends SoftwareApplication {
	@Override
	public void open() {
		System.out.println("Instagram open");
	}

	@Override
	public void signUp() {
		System.out.println("Instagram Signed Up");
	}	

	@Override
	public void singIn() {
		System.out.println("Instagram Signed In");
	}

	@Override
	public void singOut() {
		System.out.println("Instagram Signed Out");
	}		

	@Override
	public void close() {
		System.out.println("Instagram closed");
	}
}