class IncrementOperator {
	public static void main(String[] args) {

		int i = 10;

		System.out.println("The value of i is : " + i);

		int j = 20;

		System.out.println("The value of j is : " + j);

		int inc = ++i - j++ + i++ - ++j;
		System.out.println("The value of inc is : " + inc);

		System.out.println();

		System.out.println("The updated value of i is : " + i);
		System.out.println("The updated value of j is : " + j);
	}
}