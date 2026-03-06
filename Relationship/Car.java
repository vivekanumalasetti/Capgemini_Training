class Car {

	//Engine Object
	private String brand;
	private double price;
	private String make;
	private String colour;

	private Engine engine;
	public Car(String brand, double price, String make, String colour, Engine engine) {
		this.brand = brand;
		this.price = price;
		this.make = make;
		this.colour = colour;
		this.engine = engine;
	}

	private MediaPlayer mediaPlayer;

	public String getBrand() {
		return brand;
	}
 
 	public String getMake() {
		return make;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}


	//Read Now
	public Engine getEngine() {
		return engine;
	}

	public MediaPlayer getMediaPlayer() {
		return mediaPlayer;
	}

	public void setMediaPlayer(MediaPlayer mediaPlayer) {
		this.mediaPlayer = mediaPlayer;
	}

	public void displayCarInfo() {
		System.out.println("Car Details");
		System.out.println("-----------");
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
		System.out.println("Make : " + make);
		System.out.println("Colour : "+ colour);
		System.out.println();
	}

}