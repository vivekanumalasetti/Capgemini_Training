class DisariumNumber {
	public static void main(String[] args) {
		int n = 135;
		int count = 0;
		int cube = 0;

		int n1 = n;
		int n2 = n;

		while(n > 0) {
			int rem = n % 10;
			count++;
			n = n/10;
		}

		while(n1 > 0) {
			int rem = n1 % 10;
			cube = cube + (int) Math.pow(rem,count);
			count--;
			n1 = n1/10;
		}

		if(n2 == cube) {
			System.out.println("Its a DisariumNumber");
		} else {
			System.out.println("Its not a DisariumNumber");
		}

	}
}