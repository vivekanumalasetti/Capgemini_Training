class SuperNumber {
	public static void main(String[] args) {
		
		int l = 1234;

		int EvenSum = 0;
		int OddSum = 0;

		while(l > 0) {
			int r = l % 10;

			if(r%2 == 0) {
				EvenSum = EvenSum + r;
			} else if (r%2 != 0) {
				OddSum = OddSum + r;
			}

			l = l/10;
		}

		System.out.println("The EvenSum is : " + EvenSum);
		System.out.println("The OddSum is : " + OddSum);

		System.out.println(EvenSum == OddSum ? "Its... a SuperNumber" : "Its... not a SuperNumber");
	}
}