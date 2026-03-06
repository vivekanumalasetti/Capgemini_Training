import java.util.Scanner;

class WAP_Check {
	public static void main(String[] args) {
		System.out.print("Enter a Number : ");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int value = num;
		int sum = 0;

  		if(num > 0) {
			for(int i=1; i<num; i++) {
				if(num % i == 0) {
					sum = sum + i;
				}
			}

			if(sum < value) {
				System.out.println("Deficient");
			} else if (sum > value) {
				System.out.println("Abundant");
			} else {
				System.out.println("Perfect");
			}
		}


	}
}