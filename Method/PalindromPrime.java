import java.util.Scanner;

class PalindromPrime {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int value = n;
		int rem = 0;
		int rev = 0;
		int count = 0;

		while(n>0) {
			rem = n%10;
			rev = (rev*10) + rem;
			n = n/10;
		}

		for(int i=2; i<value; i++) {
			if(value%i == 0) {
				count++;
			}
		}

		if((value == rev) && (count == 0)) {
			System.out.println("Its a Palindrom Prime");
		} else {
			System.out.println("Its not a Palindrom Prime");
		}
	}
}