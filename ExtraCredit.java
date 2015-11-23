public class Coins {
	
	public static void main(String[] args) {
		System.out.println(possibleCoins(53));
	}
	
	public static String possibleCoins(int coins) {
		int quarters = 0, dimes = 0, nickels = 0, pennies = 0;
		
		for(int q = 0; q + 1 <= coins / 25; q++) {
			quarters++;
			for(int d = 0; d + 1 <= coins / 10; d++) {
				dimes++;
				System.out.println(dimes);
				for(int n = 0; n + 1 <= coins / 5; n++) {
					nickels++;
					for(int p = 0; p + 1 <= coins / 1; p++) {
						pennies++;
					}
				}
			}
		}
		
		return coins + " cents = " + quarters + " quarters + " + dimes + " dimes + " + nickels/10 + " nickels + " + pennies / 100 + " pennies"; 
		
	}
	
	
}
