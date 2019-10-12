package vehicles;
import java.util.*;

public class InventoryManager {
	public static void main(String args[]) {
        int selection = 0;
        Scanner input = new Scanner(System.in);
        ListManager inventory = new ListManager();
        
        while(selection!=4) {
        	printMenu();

        selection = input.nextInt();
       
        switch(selection) {
        	
        case 1: 
        	inventory.printInventoryList();
        	break;
        case 2: 
        	inventory.addVehicle();
        	break;
        case 3: 
        	inventory.deleteVehicle();
        	break;
        case 4:
        	inventory.sellVehicle();
        	break;
        case 5:
        	break;
        default:
        	break;
        }
        
        }
        input.close();
    }
	
	private static void printMenu() {
		System.out.println("Choose an option");
        System.out.println("----------------\n");
        System.out.println("1 - View current inventory");
        System.out.println("2 - Add a vehicle to inventory");
        System.out.println("3 - Delete a vehicle from inventory");
        System.out.println("4 - Sell vehicle");
        System.out.println("5 - Quit");
	}
	    
	}

