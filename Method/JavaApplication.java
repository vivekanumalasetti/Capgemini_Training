import java.util.Scanner;

class JavaApplication {
	public static void execute() {
		// ArithmeticOperations.addition(3,6);
		// ArithmeticOperations.subpraction(9,6);
		// ArithmeticOperations.multiplation(3,3);
		// ArithmeticOperations.divion(9,3);
		// ArithmeticOperations.modulas(9,3);

		// NumberSeries.series(1,5);
		// NumberSeries.series(5,1);

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the starting point : ");

		int start = sc.nextInt();

		System.out.print("Enter the Ending point : ");

		int end = sc.nextInt();

		NumberSeries.series(start,end);
	}
}