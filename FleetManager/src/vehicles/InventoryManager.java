package vehicles;
import java.util.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


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
        	inventory.printList();
        	break;
        case 2: 
        	System.out.println("Add to what list?");
        	System.out.println("1. Trucks");
        	System.out.println("2. Vans");
        	System.out.println("3. Cars");
        	selection = input.nextInt();
        	switch(selection) {
        	case 1:
        		inventory.createTruck();
        		break;
        	case 2:
        		inventory.createVan();
        		break;
        	case 3:
        		inventory.createCar();
        		break;
        	}
        	break;
        case 3: 
        	System.out.println("Delete from what list?");
        	System.out.println("1. Trucks");
        	System.out.println("2. Vans");
        	System.out.println("3. Cars");
        	selection = input.nextInt();
        	switch(selection) {
        	
        	case 1:
        		/*
        		System.out.print("Delete what index? ");
        		selection = input.nextInt();
        		if(selection < truckList.size()) {
        		truckList.remove(selection);
        		System.out.println("Index " + selection + " removed.");
        		}
        		else System.out.println("Invalid selection.");
        		break;
        	case 2:
        		System.out.print("Delete what index? ");
        		selection = input.nextInt();
        		if(selection < truckList.size()) {
        		vanList.remove(selection);
        		System.out.println("Index " + selection + " removed.");
        		}
        		else System.out.println("Invalid selection.");
        		break;
        	case 3:
        		System.out.print("Delete what index? ");
        		selection = input.nextInt();
        		if(selection < truckList.size()) {
        		carList.remove(selection);
        		System.out.println("Index " + selection + " removed.");
        		}
        		else System.out.println("Invalid selection.");
        		break;
        	*/}
        	break;
        case 4:
        	break;
        default:
        	break;
        }
        
        }
    }
	
	private static void printMenu() {
		System.out.println("Choose an option");
        System.out.println("----------------\n");
        System.out.println("1 - View current inventory");
        System.out.println("2 - Add a vehicle to inventory");
        System.out.println("3 - Delete a vehicle from inventory");
        System.out.println("4 - Quit");
	}
	    
	}

