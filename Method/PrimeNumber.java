import java.util.Scanner;

class PrimeNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int count = 0;

		for(int i=2; i<n; i++) {
			if(n%i == 0) {
				count++;
			}
		}

		if(count == 0) {
			System.out.println("Its a Prime number");
		} else {
			System.out.println("Its a Composite number");
		}
		
	}
}