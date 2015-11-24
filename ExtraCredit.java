public class Coins {
	
	public static void main(String[] args) {
		possibleCoins(53);
		//System.out.println(53 / 10)
	
		/*
		for(int n = 0; n + 1 <= coins / 5; n++) {
				System.out.println("n is currently " + n);
				nickels++;
				for(int p = 0; p + 1 <= coins / 1; p++) {
					System.out.println("p is currently " + p);
					pennies++;
				}
			}
			
		*/
	}
	
	public static void possibleCoins(int coins) {
		int quarters = 0, dimes = 0, nickels = 0, pennies = 0;
		
		for(int q = 0; q <= (coins / 25); q++) {
			//System.out.println("q is currently " + q);
			System.out.println("Must make change for " + (coins - (q * 25)));
			
			for(int d = 0 ; d*10 <=  coins - (q * 25) ; d++) { //for trying #s of dimes {
				System.out.println("\tMust make change for " + (coins - (d * 10)));
				
				for(int n = 0; n * 5 <= coins;n++ ) {
					
				}
			}
			
			
			
		}
		/*
		for(int d = 0; d <= (coins - (quarters * 25)); d++) {
				System.out.println("d is currently " + d);
				dimes = d;
		}
		return coins + " cents = " + quarters + " quarters + " + dimes + " dimes + " + nickels/10 + " nickels + " + pennies / 100 + " pennies";
		*/ 
		
	}
	
	
}
