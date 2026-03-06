import java.util.*;

class IfElse_IfStatement {
	public static void main(String[] args) {

		System.out.print("The the number i : ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		// int i = 3;

		if(i % 2 == 0) {
			System.out.println("It is a Even Number");
		} else if(i % 2 != 0) {
			System.out.println("It is a Odd Number");
		} else {
			System.out.println("It is Zero");
		}
	}
}