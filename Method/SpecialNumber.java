import java.util.Scanner;

class SpecialNumber{
	public static void main(String[] args) {

		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum = 0;
		int product = 1;
		int n = num;

		while(num > 0) {
			int rem = num % 10;
			sum += rem;
			product *= rem;
			num = num/10;
		}

		int value = sum + product;

		if(n == value) {
			System.out.println("It is SpecialNumber");
		} else {
			System.out.println("It is not a SpecialNumber");
		}
		
	}
}