import java.util.Scanner;

class ForwardSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Table Number : ");
		int n = sc.nextInt();

		System.out.print("Enter the no of steps : ");
		int steps = sc.nextInt();

		for(int i=1; i<=steps; i++) {

			//Even series
			if(i%2 == 0) {
				System.out.println(n + " * " + i + " = " + (n*i));
			}

			// //Odd series
			// if(i%2 != 0) {
			// 	System.out.println(n + " * " + i + " = " + (n*i));
			// }
		}
	}
}