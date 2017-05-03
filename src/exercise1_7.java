public class exercise1_7 {
	public static void main(String[] args) {
		//Approximate pi:
		// pi = 4 x (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)
		
		double pi = 4 * (1.0 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11);
		double pi2 = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13);
		
		System.out.println(pi);
		System.out.println(pi2);

	}

}
