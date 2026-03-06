import java.util.Scanner;

class Palindrom {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int value = n;
		int rem = 0;
		int rev = 0;

		while(n>0) {
			rem = n%10;
			rev = (rev*10) + rem;
			n = n/10;
		}

		if(value == rev) {
			System.out.println("Its a Palindrom");
		} else {
			System.out.println("Its not a Palindrom");
		}
	}
}