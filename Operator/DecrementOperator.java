class DecrementOperator {
	public static void main(String[] args) {

		int i = 34;

		System.out.println("The value of i is : " + i);

		int j = 75;

		System.out.println("The value of j is : " + j);

		int dec = i-- + --j + --i + j--;
		System.out.println("The value of dec is : " + dec);

		System.out.println();

		System.out.println("The updated value of i is : " + i);
		System.out.println("The updated value of j is : " + j);
	}
}