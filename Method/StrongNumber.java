import java.util.Scanner;

class StrongNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact = 1;
		int sum = 1;
		int n = num;

		while(num > 0) {
			int rem = num % 10;
			for(int i = 1; i <= rem; i++) {
            	fact = fact * i;
        	}
			sum = sum + fact;
			num = num / 10;
		}

		System.out.println(sum == n ? "True" : "False");

	}

}