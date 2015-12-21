import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class InventoryManager {

	public static void printInventory(Item[] item) {
		System.out.println("Name\tQuantity\tPrice Per Unit");
		
		for(int i = 0; i < item.length ; i++) {
			System.out.println(item[i]);
		}	
	}
	
	public static void checkLowInventory(Item[] item) { 
		System.out.println("Name\tQuantity\tPrice Per Unit");
		for(int i = 0; i < item.length; i++) {
			Item i1 = item[i];
			if(i1.getQty() < 5) {
				System.out.println(i1);
			}
		}
		
	}
	
	public static void totalInventoryValue(Item[] item) {
		double total = 0;
		for(int i = 0; i < item.length; i++) {
			Item i1 = item[i];
			total += (i1.getQty() * i1.getPrice());
		}
		System.out.println(total);
	}
	
	public static void main(String[] args) {	
		
		Item i1 = new Item("Paper", 500, 0.5);
		Item i2 = new Item("Pencil", 400, 0.5);
		Item i3 = new Item("Eraser", 4, 0.5);
		Item i4 = new Item("Backpack", 3, 10.00);
		Item[] item = {i1, i2, i3, i4};
		
		//printInventory(item);
		
		//FILE IO READING
		//ArrayList<String> list1 = new ArrayList<String>();
		Item[] item1 = new Item[10];
		File inputFile = new File("items.txt");
		Scanner inputScanner;
		
		
		try {
			inputScanner = new Scanner ( inputFile);
		}catch (FileNotFoundException f) {
			System.out.println("Cannot open file: " + f);
			return;
		}
		
		while (inputScanner.hasNextLine()) {
			int i = 0;
			String curLine = inputScanner.next();
			int curNum = inputScanner.nextInt();
			double curDouble = inputScanner.nextDouble();
			item[i] = new Item(curLine, curNum, curDouble);
			i++;
			
			
			
		}
		
		
		//SCANNER 
		Scanner choose = new Scanner(System.in);
	    String choice;
	    //System.out.println("Print Inventory (p)\nCheck Low Inventory (c)\nTotal Inventory Value (v)\nExit (e)");
	    choice = "";

	    
	    while (!"e".equals(choice)) {
	    	System.out.println("Print Inventory (p)\nCheck Low Inventory (c)\nTotal Inventory Value (v)\nExit (e)");
	        choice = choose.next();
	    
	        if( "e".equals(choice)) {
	        	return;
	        }
	        else  if ("p".equals(choice)) {
	        	printInventory(item);
	            choice = null;
	            System.out.println();
	        }
	        else if ("c".equals(choice)) {
	            checkLowInventory(item);
	            choice = null;
	            System.out.println();
	        }
	        else if ("v".equals(choice)) {
	        	totalInventoryValue(item);
	        	choice = null;
	        	System.out.println();
	        }
	        else {
	        	System.out.println("ENTER A VALID CHOICE!!!!");
	        }
	        
	    
	    }
	    choose.close();

	}
}
