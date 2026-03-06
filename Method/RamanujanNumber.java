class RamanujanNumber{
	public static void main(String[] args) {
		int num = 1729;
		int sum = 0;
		int rev = 0;

		int num1 = 1729;
		int num3 = 1729;

		while(num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num/10;
		}

		int sum1 = sum;

		while(sum > 0) {
			int rem = sum%10;
			rev = (rev*10) + rem;
			sum = sum/10;
		}

		int finalValue = sum1 * rev;

		if(finalValue == num3) {
			System.out.println("Its a RamanujanNumber");
		} else {
			System.out.println("Its not a RamanujanNumber");
		}


	}
}