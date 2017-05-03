public class exercise1_11 {
	public static void main(String[] args) {
		//population projection
		
		int population = 312032486;
		int secondsPerYear = 60 * 60 * 24 * 365;
		int birth = secondsPerYear / 7;
		int deaths = secondsPerYear / 13;
		int immigrant = secondsPerYear / 45;
		int years = 1;
		int updatedPopulation = population + birth + immigrant - deaths;
		
		System.out.println("The population after one year is " + 
				years * 1 * updatedPopulation);
		

	}

}
