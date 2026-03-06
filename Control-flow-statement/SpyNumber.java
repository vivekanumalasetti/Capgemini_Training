class SpyNumber {
	public static void main(String[] args) {

		int j = 123;

		int product = 1;
		int sum = 0;

		while(j > 0) {
			int rem = j % 10;
			product = product * rem;
			sum = sum + rem;
			j = j/10;
		}

		if(product == sum) {
			System.out.println("Yes.. it is a Spy Number");
		} else {
			System.out.println("No.. it is not a Spy Number");
		}	
		
	}
}

