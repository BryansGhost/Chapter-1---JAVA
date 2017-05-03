public class exercise1_10 {
	public static void main(String[] args) {
		//runner runs 14 kl. in 45 mins and 30 seconds. Display
		//the average speed in miles per hour
		
		double kilometers = 14;
		double miles = kilometers * 0.621371;
		double minutes = 45 * 60;
		double seconds = minutes + 45;
		double mph = seconds / 60 / 60 * miles;
		
		System.out.println("The runner was running " + mph + " mph");
	}

}
