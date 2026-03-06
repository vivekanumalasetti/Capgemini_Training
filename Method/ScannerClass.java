import java.util.Scanner;

class ScannerClass{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the starting point : ");

		int start = sc.nextInt();

		System.out.print("Enter the Ending point : ");

		int end = sc.nextInt();

		NumberSeries.series(start,end);
	}
}