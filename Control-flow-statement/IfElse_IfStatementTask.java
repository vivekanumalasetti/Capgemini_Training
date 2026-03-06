import java.util.*;

class IfElse_IfStatementTask {
	public static void main(String[] args) {

		System.out.print("Enter the input : ");
		Scanner sc = new Scanner(System.in);
		char input = sc.next().charAt(0);

		if((input == 'R') || (input == 'r')) {
			System.out.println("Please Stop");
		} else if ((input == 'Y') || (input == 'y')) {
			System.out.println("Get Ready to Start");
		} else {
			System.out.println("Let's Go");
		}

		System.out.println("Have A Safe Ride");
	}
}