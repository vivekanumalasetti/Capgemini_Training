import java.util.Scanner;

class HarshadNumber{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number : ");

		int num = sc.nextInt();
		int sum = 0;
		int n = num;

		while(num > 0) {
			int rm = num % 10;
			sum = sum + rm;
			num = num / 10;
		}

		System.out.println(n % sum == 0 ? "It is a HarshadNumber..." : "It is not a HarshadNumber...");
		
	}
}