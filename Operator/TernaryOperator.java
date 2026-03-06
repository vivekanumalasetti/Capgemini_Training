class TernaryOperator {
	public static void main(String[] args) {

		int i = 10;

		System.out.println("The value of i is : " + i);


		int j = 5;

		System.out.println("The value of j is : " + j);


		boolean ans = i > j;

		System.out.println("The value of ans is : " + ans);


		int ans1 = ans ? (i + j) : (i * j);

		//Indirect utilization
		System.out.println("The value of ans1 is : " + ans1);	

		//Indirect utilization
		System.out.println(ans ? (i + j) : "true");
			


	}
}