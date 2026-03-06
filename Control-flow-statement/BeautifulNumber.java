class BeautifulNumber {
	public static void main(String[] args) {
		
		int k = 1234;

		int EvenCount = 0;
		int OddCount = 0;

		while(k > 0) {
			int rem = k % 10;

			if(rem%2 == 0) {
				EvenCount++;
			} else if (rem%2 != 0) {
				OddCount++;
			}

			k = k/10;
		}

		System.out.println("The EvenCount is : " + EvenCount);
		System.out.println("The OddCount is : " + OddCount);
	}
}