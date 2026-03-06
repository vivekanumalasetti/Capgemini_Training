import java.util.Scanner;

class DivisorsAndFactors{
	public static void main(String[] args) {
		System.out.print("Enter a Number : ");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int count = 0;

		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				count++;
			}
		}

		System.out.println("The total number of divisors of " + num + " is : " + count);
	}
}