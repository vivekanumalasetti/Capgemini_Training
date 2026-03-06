class MediaPlayer {
	private String brand;
	private double price;
	private String make;

	public MediaPlayer(String brand,String make,double price) {
		this.brand = brand;
		this.make = make;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	void setMake(String make) {
		this.make = make;
	}

	public void getMediaPlayerInfo() {
		System.out.println("MediaPlayer Details");
		System.out.println("-------------------");
		System.out.println("Brand Name : " + getBrand());
		System.out.println("Make : " + getMake());
		System.out.println("Price : " + getPrice());
		System.out.println();
	}
}