class EveryOther {
	public static void main(String[] args) {
		everyOther(3,15,3);
		//System.out.println(test(everyOther(3,13), new int[]{3,5,7,9,11}));
		 
	}

	public static int[] everyOther(int start, int stop, int step){
		int count = 0;
		int len = 0;
		if ((stop - start)%2 == 0) {
			len = (stop - start)/step;
		} else{
			len = ((stop - start) + 1)/step;
		}

		int list[] = new int[len];


		for (int i = start; i < stop; i = i + step){
			System.out.println(i);
			list[count] = i;
			count++;
		}

		return list;
	}

	public static boolean test(int[] given, int[] expected) {
		int total = 0;

		if (given.length != expected.length) {
			return false;
		}

		for (int i = 0; i < given.length; i++){
			if (given[i] == expected[i]){
				total++;
			}
			
		} 
		if (total == given.length) {
			return true;
			
		}
		return false;

		// if (given.length == expected.length){
		// 	for (int i = 0; i < given.length; i++) {
		// 		if (given[i] == expected[i]) {
		// 			total++;
					
		// 		}
		// 		return false;
		// 	}
		// 	return true;
		// }
		// return false;

	}
}