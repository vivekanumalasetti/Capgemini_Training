class NumberSeries {
	public static void series(int start, int end) {

		if(start < end) {
			for(int i=start; i<=end; i++) {
				System.out.print(i + " ");
			}

			System.out.println();
		} 
		else if(start > end) {
			for(int i=start; i>=end; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
		} 
		else {
			System.out.println("Invalid series");
		}
		
	}
}