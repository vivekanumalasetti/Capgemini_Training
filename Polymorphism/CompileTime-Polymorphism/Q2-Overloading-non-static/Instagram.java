class Instagram{
	public String username;
	public String password;
	public String mailId;
	public String captcha;
	public long contactNumber;
	public int otp;
	public void login(String username,String password) {
		this.username = username;
		this.password = password;
		System.out.println("Instagram-User Sucessfully login...");
	}
	public void login(String username,String mailId,String password) {
		this.username = username;
		this.mailId = mailId;
		this.password = password;
		System.out.println("Instagram-User Sucessfully login...");
	}
	public void login(String mailId,int otp) {
		this.mailId = mailId;
		this.otp = otp;
		System.out.println("Instagram-User Sucessfully login...");
	}
	public void login(long contactNumber ,int otp) {
		this.contactNumber = contactNumber;
		this.otp = otp;
		System.out.println("Instagram-User Sucessfully login...");
	}

}