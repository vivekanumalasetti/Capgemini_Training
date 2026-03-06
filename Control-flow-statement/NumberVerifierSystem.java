class NumberVerifierSystem {
	public static void main(String[] args) {

		int num = 3;

		if((num < 0) && (num % 2 == 0)) {
			System.out.println("It is a Negative Even Number");
		} else if((num < 0) && (num % 2 != 0)) {
			System.out.println("It is a Negative Odd Number");	
		} else if((num > 0) && (num % 2 == 0)) {
			System.out.println("It is a Positive Even Number");
		} else if((num > 0) && (num % 2 != 0)) {
			System.out.println("It is a Positive Odd Number");	
		} else if((num % 2 == 0) && (num / 2 == 0) && (num == 0)) {
			System.out.println("It is a Zero");
		} else {
			System.out.println("Invalid Input");
		}
	}
}