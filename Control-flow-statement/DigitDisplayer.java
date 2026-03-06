class DigitDisplayer{
	public static void main(String[] args) {
		int input = 12345;

		int i = input;
		int reminder = 0;

		while(input>0) {
			reminder = input%10;
			System.out.println(reminder);
			input = input/10;
		}
	}
}