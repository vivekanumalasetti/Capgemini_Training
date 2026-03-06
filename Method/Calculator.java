import java.util.Scanner;

class Calculator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Boolean choice = true;

		do {

			System.out.print("Enter the operator : ");
			int operation = sc.nextInt();

			System.out.print("Enter the input a : ");
			int a = sc.nextInt();

			System.out.print("Enter the input a : ");
			int b = sc.nextInt();

			switch(operation) {
				case 1 : System.out.println(a+b);
					break;
				case 2 : System.out.println(a-b);
			    	break;	
				case 3 : System.out.println(a*b);
					break;
				case 4 : System.out.println(Math.floorMod(a,b));	
					break;
				case 5 : choice = false;
					break;
				default : System.out.println("Invalid Choice");
					break;
		}


		} while(choice);

		System.out.println("Thank you for visiting...");
	}
}