public class ExtraCredit {
	
	public static void main(String[] args) {
		System.out.println(possibleCoins(10));
		
	}
	
	public static String possibleCoins(int coins) {
		double c = coins;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		
		for(int q = 0; 25 <= coins; q++) {
			coins -= 25;
			quarters++;
			for(int d = 0; 10 <= coins; d++) {
				coins -= 10;
				dimes++;
				for(int n = 0; 5 <= coins; n++) {
					coins -= 5;
					nickels++;
					for(int p = 0; 1 <= coins; p++) {
						coins--;
						pennies++;
					}
				}
			}
			
			

		}
		
		return c + " cents = " + quarters + " quarters + " + dimes + " dimes + " + nickels + " nickels + " + pennies + " pennies"; 
		
	}
	
	
}
