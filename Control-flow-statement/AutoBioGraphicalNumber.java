class AutoBioGraphicalNumber {
	public static void main(String[] args) {
		int i = 300300;

		int sum = 0;
		int count = 0;

		while(i > 0) {
			int reminder = i % 10;
			sum = sum + reminder;
			count++;
			i = i/10;
		}

		if(sum == count) {
			System.out.println("Yes.. it is a AutoBioGraphicalNumber");
		} else {
			System.out.println("No.. it is not a AutoBioGraphicalNumber");
		}

	}
}


