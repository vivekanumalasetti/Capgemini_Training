import java.util.Scanner;

class NeonNumber{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");

		int num = sc.nextInt();
		int n = num;

		int square = num * num;
		int sum = 0;

		while(square > 0) {

			int rm = square%10;
			sum = sum + rm;
			square = square/10; 
		}

		System.out.println(n % sum == 0 ? "It is a NeonNumber..." : "It is not a NeonNumber...");
		
	}
}