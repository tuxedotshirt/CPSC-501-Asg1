package vehicles;
import java.util.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


public class InventoryManager {
	public static void main(String args[]) {
        int selection = 0;
        Scanner scanner = null;
        String str;
        List<Truck> truckList = new ArrayList<Truck>();
        List<Van> vanList = new ArrayList<Van>();
        List<Car> carList = new ArrayList<Car>();
        int number = 1;
        
        Truck truck = new Truck();
        truck.setVin(1);
        truck.setMake("Toyota");
        truck.setModel("4Runner");
        truck.setDriveWheels(4);
        truck.setCarryingCapacityLbs(500);
        truck.setNumDoors(2);
        truck.setNumPassengers(4);
        truckList.add(truck);
        
        truck = new Truck();
        truck.setVin(2);
        truck.setMake("Toyota");
        truck.setModel("4Runner");
        truck.setDriveWheels(4);
        truck.setCarryingCapacityLbs(500);
        truck.setNumDoors(2);
        truck.setNumPassengers(4);
        truckList.add(truck);
        
        Van van = new Van();
        van.setVin(3);
        van.setMake("GMC");
        van.setModel("Safari");
        van.setSlidingDoor(true);
        van.setNumDoors(3);
        van.setNumPassengers(6);
        vanList.add(van);
        
        Car car = new Car();
        car.setVin(4);
        car.setMake("Toyota");
        car.setModel("Prius");
        car.setHorsepower(5000);
        car.setHasRearHatch(true);
        car.setNumDoors(4);
        car.setNumPassengers(4);
        carList.add(car);
        
        
        Scanner input = new Scanner(System.in);
        while(selection!=4) {
        System.out.println("Choose an option");
        System.out.println("----------------\n");
        System.out.println("1 - View current inventory");
        System.out.println("2 - Add a vehicle to inventory");
        System.out.println("3 - Delete a vehicle from inventory");
        System.out.println("4 - Quit");

        selection = input.nextInt();
       
        switch(selection) {
        	
        case 1: 
        	System.out.println("**********TRUCKS**********");
        	if(!truckList.isEmpty()) {
        	for(int i = 0; i < truckList.size(); i++){
        		System.out.println();
        		System.out.println(i + ".");
        		if(truckList.get(i).getMake() != null) {
        			System.out.print("Make: ");
        			System.out.println(truckList.get(i).getMake());
        		}
        		if(truckList.get(i).getModel() != null) {
        			System.out.print("Model:");
        			System.out.println(truckList.get(i).getModel());
        		}
        		if(truckList.get(i).getVin() != 0) {
        			System.out.print("Vin: ");
        			System.out.println(truckList.get(i).getVin());
        		}
        		if(truckList.get(i).getDriveWheels() != 0) {
        			System.out.print("Driven wheels: ");
        			System.out.println(truckList.get(i).getDriveWheels());
        		}
        		if(truckList.get(i).getCarryingCapacityLbs() != 0) {
        			System.out.print("Carrying capacity: ");
        			System.out.println(truckList.get(i).getCarryingCapacityLbs());
        		}
        		if(truckList.get(i).getNumPassengers() != 0) {
        			System.out.print("Number of passengers: ");
        			System.out.println(truckList.get(i).getNumPassengers());
        		}
        		if(truckList.get(i).getNumDoors() != 0) {
        			System.out.print("Number of doors: ");
        			System.out.println(truckList.get(i).getNumDoors());
        		}
        	}
        	}
        	else System.out.println("Truck list empty");
        	
        	System.out.println();
        	
        	System.out.println("***********VANS***********");
        	if(!vanList.isEmpty()) {
        		System.out.println();
        	vanList.forEach((temp) -> {
        		if(temp.getMake() != null) {
        			System.out.print("Make: ");
        			System.out.println(temp.getMake());
        		}
        		if(temp.getModel() != null) {
        			System.out.print("Model:");
        			System.out.println(temp.getModel());
        		}
        		if(temp.getVin() != 0) {
        			System.out.print("Vin: ");
        			System.out.println(temp.getVin());
        		}
        		if(temp.getSlidingDoorSet()) {
        			System.out.print("Sliding door: ");
        			System.out.println(temp.getSlidingDoor());
        		}
        		if(temp.getNumPassengers() != 0) {
        			System.out.print("Number of passengers: ");
        			System.out.println(temp.getNumPassengers());
        		}
        		if(temp.getNumDoors() != 0) {
        			System.out.print("Number of doors: ");
        			System.out.println(temp.getNumDoors());
        		}
            	});
        	}
        	else System.out.println("Van list empty");
        	System.out.println();
        	
        	System.out.println("***********CARS***********");
        	if(!carList.isEmpty()) {
        		System.out.println();
        	carList.forEach((temp) -> {
        		System.out.println();
        		if(temp.getMake() != null) {
        			System.out.print("Make: ");
        			System.out.println(temp.getMake());
        		}
        		if(temp.getModel() != null) {
        			System.out.print("Model:");
        			System.out.println(temp.getModel());
        		}
        		if(temp.getVin() != 0) {
        			System.out.print("Vin: ");
        			System.out.println(temp.getVin());
        		}
        		if(temp.getHorsepower() != 0) {
        			System.out.print("Horsepower: ");
        			System.out.println(temp.getHorsepower());
        		}
        		if(temp.getRearHatchSet()) {
        			System.out.print("Rearhatch: ");
        			System.out.println(temp.getHasRearHatch());
        		}
        		if(temp.getNumPassengers() != 0) {
        			System.out.print("Number of passengers: ");
        			System.out.println(temp.getNumPassengers());
        		}
        		if(temp.getNumDoors() != 0) {
        			System.out.print("Number of doors: ");
        			System.out.println(temp.getNumDoors());
        		}
            	});
        	}
        	else System.out.println("Car list empty");
        	System.out.println();
        	
        	break;
        case 2: 
        	System.out.println("Add to what list?");
        	System.out.println("1. Trucks");
        	System.out.println("2. Vans");
        	System.out.println("3. Cars");
        	selection = input.nextInt();
        	switch(selection) {
        	case 1:
        		truck = new Truck();
        		System.out.print("Vin: ");
        		selection = input.nextInt();
                truck.setVin(selection);
                //System.out.println();
                input.nextLine();
                
                System.out.print("Make: ");
                str = input.nextLine();
                truck.setMake(str);
                
                
                System.out.print("Model: ");
                str = input.nextLine();
                truck.setModel(str);
                

                System.out.print("Number of drive wheels: ");
                selection = input.nextInt();
                truck.setDriveWheels(selection);
                //System.out.println();
                
                System.out.print("Carrying capacity: ");
                selection = input.nextInt();
                truck.setCarryingCapacityLbs(selection);
                //System.out.println();
                
                System.out.print("Number of doors: ");
                selection = input.nextInt();
                truck.setNumDoors(selection);
                //System.out.println();
                
                System.out.print("Number of passengers: ");
                selection = input.nextInt();
                truck.setNumPassengers(selection);
                //System.out.println();
                
                truckList.add(truck);
        		break;
        	case 2:
        		van = new Van();
        		System.out.print("Vin: ");
        		selection = input.nextInt();
                van.setVin(selection);
                input.nextLine();
                
                System.out.print("Make: ");
                str = input.nextLine();
                van.setMake(str);
                
                System.out.print("Model: ");
                str = input.nextLine();
                van.setModel(str);

                System.out.print("Sliding door? 1:yes, 2:no");
                selection = input.nextInt();
                if(selection == 1)
                	van.setSlidingDoor(true);
                else if(selection == 2)
                	van.setSlidingDoor(false);
                input.nextLine();
                
                System.out.print("Number of doors: ");
                selection = input.nextInt();
                van.setNumDoors(selection);
                input.nextLine();
                
                System.out.print("Number of passengers: ");
                selection = input.nextInt();
                van.setNumPassengers(selection);
                input.nextLine();
                
                vanList.add(van);
        		break;
        	case 3:
        		car = new Car();
        		System.out.print("Vin: ");
        		selection = input.nextInt();
                car.setVin(selection);
                input.nextLine();
                
                System.out.print("Make: ");
                str = input.nextLine();
                car.setMake(str);
                
                System.out.print("Model: ");
                str = input.nextLine();
                car.setModel(str);

                System.out.print("Rear hatch? 1:yes, 2:no");
                selection = input.nextInt();
                if(selection == 1)
                	car.setHasRearHatch(true);
                else if(selection == 2)
                	car.setHasRearHatch(false);
                input.nextLine();
                
                System.out.print("Horsepower: ");
                selection = input.nextInt();
                car.setHorsepower(selection);
                input.nextLine();
                
                System.out.print("Number of doors: ");
                selection = input.nextInt();
                car.setNumDoors(selection);
                input.nextLine();
                
                System.out.print("Number of passengers: ");
                selection = input.nextInt();
                car.setNumPassengers(selection);
                input.nextLine();
                
                carList.add(car);
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
        	}
        	break;
        case 4:
        	break;
        default:
        	break;
        }
        
        }
    }
	

    
	}
