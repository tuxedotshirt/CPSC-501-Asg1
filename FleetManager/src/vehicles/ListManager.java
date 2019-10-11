package vehicles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManager {
    List<Truck> truckList = new ArrayList<Truck>();
    List<Van> vanList = new ArrayList<Van>();
    List<Car> carList = new ArrayList<Car>();
    
    public void createTruck(){
    	List<Object> paramList = new ArrayList<Object>();
		int value;
		String str;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Vin: ");
		value = input.nextInt();
		paramList.add(value);
		
		input.nextLine();
		
		System.out.print("Make: ");
		str = input.nextLine();
		paramList.add(str);
		
		System.out.print("Model: ");
		str = input.nextLine();
		paramList.add(str);
		
		System.out.print("Number of drive wheels: ");
		value = input.nextInt();
		paramList.add(value);
		
		System.out.print("Carrying capacity: ");
		value = input.nextInt();
		paramList.add(value);
		
		System.out.print("Number of doors: ");
		value = input.nextInt();
		paramList.add(value);
		
		System.out.print("Number of passengers: ");
		value = input.nextInt();
		paramList.add(value);
    	
		addToTruckList(paramList);
    }
    
    private void addToTruckList(List<Object> paramList) {
    	Truck truck;
		truck = new Truck();

		truck.setVin((int) paramList.get(0));

		truck.setMake(paramList.get(1).toString());
		
		truck.setModel(paramList.get(2).toString());
		
		truck.setDriveWheels((int) paramList.get(3));
		
		truck.setCarryingCapacityLbs((int) paramList.get(4));
		
		truck.setNumDoors((int) paramList.get(5));

		truck.setNumPassengers((int) paramList.get(6));

		truckList.add(truck);
    }
    
    public void createVan() {
    	List<Object> paramList = new ArrayList<Object>();
		int value;
		String str;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Vin: ");
		value = input.nextInt();
		paramList.add(value);
		
		input.nextLine();
		
		System.out.print("Make: ");
		str = input.nextLine();
		paramList.add(str);
		
		System.out.print("Model: ");
		str = input.nextLine();
		paramList.add(str);
		
		System.out.print("Has sliding door: 1=yes 2=no");
		value = input.nextInt();
		if(value == 1)
			paramList.add(true);
		else if(value == 2)
			paramList.add(false);
		
		System.out.print("Number of doors: ");
		value = input.nextInt();
		paramList.add(value);
		
		System.out.print("Number of passengers: ");
		value = input.nextInt();
		paramList.add(value);
    	
		addToVanList(paramList);
    }
    
    private void addToVanList(List<Object> paramList) {
    	Van van;
		van = new Van();

		van.setVin((int) paramList.get(0));

		van.setMake(paramList.get(1).toString());
		
		van.setModel(paramList.get(2).toString());
		
		boolean slider = false;
		if(paramList.get(3).toString() == "true") {
			slider = true;
		}
		else if(paramList.get(3).toString() == "false") {
			slider = false;
		}
		van.setSlidingDoor(slider);
		
		van.setNumDoors((int) paramList.get(4));

		van.setNumPassengers((int) paramList.get(5));

		vanList.add(van);
    }

    public void createCar(){
    	List<Object> paramList = new ArrayList<Object>();
		int value;
		String str;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Vin: ");
		value = input.nextInt();
		paramList.add(value);
		
		input.nextLine();
		
		System.out.print("Make: ");
		str = input.nextLine();
		paramList.add(str);
		
		System.out.print("Model: ");
		str = input.nextLine();
		paramList.add(str);
		
		System.out.print("Horsepower: ");
		value = input.nextInt();
		paramList.add(value);
		
		System.out.println("Has rear hatch? 1=yes 2=no" );
		value = input.nextInt();
		if(value == 1)
			paramList.add(true);
		else if(value == 2)
			paramList.add(false);
		
		System.out.print("Number of doors: ");
		value = input.nextInt();
		paramList.add(value);
		
		System.out.print("Number of passengers: ");
		value = input.nextInt();
		paramList.add(value);
    	
		addToCarList(paramList);
    }
    
    private void addToCarList(List<Object> paramList) {
    	Car car;
		car = new Car();

		car.setVin((int) paramList.get(0));

		car.setMake(paramList.get(1).toString());
		
		car.setModel(paramList.get(2).toString());
		
		car.setHorsepower((int) paramList.get(3));
		
		boolean hatch = false;
		if(paramList.get(4).toString() == "true") {
			hatch = true;
		}
		car.setHasRearHatch(hatch);
		
		car.setNumDoors((int) paramList.get(5));

		car.setNumPassengers((int) paramList.get(6));

		carList.add(car);
    }

    public void printList() {
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
    		for(int i = 0; i < vanList.size(); i++){
    		if(vanList.get(i).getMake() != null) {
    			System.out.print("Make: ");
    			System.out.println(vanList.get(i).getMake());
    		}
    		if(vanList.get(i).getModel() != null) {
    			System.out.print("Model:");
    			System.out.println(vanList.get(i).getModel());
    		}
    		if(vanList.get(i).getVin() != 0) {
    			System.out.print("Vin: ");
    			System.out.println(vanList.get(i).getVin());
    		}
    		if(vanList.get(i).getSlidingDoorSet()) {
    			System.out.print("Sliding door: ");
    			System.out.println(vanList.get(i).getSlidingDoor());
    		}
    		if(vanList.get(i).getNumPassengers() != 0) {
    			System.out.print("Number of passengers: ");
    			System.out.println(vanList.get(i).getNumPassengers());
    		}
    		if(vanList.get(i).getNumDoors() != 0) {
    			System.out.print("Number of doors: ");
    			System.out.println(vanList.get(i).getNumDoors());
    		}
        	}
    	}
    	else System.out.println("Van list empty");
    	System.out.println();
    	
    	System.out.println("***********CARS***********");
    	if(!carList.isEmpty()) {
    		System.out.println();
    	for(int i = 0; i < vanList.size(); i++){
    		System.out.println();
    		if(carList.get(i).getMake() != null) {
    			System.out.print("Make: ");
    			System.out.println(carList.get(i).getMake());
    		}
    		if(carList.get(i).getModel() != null) {
    			System.out.print("Model:");
    			System.out.println(carList.get(i).getModel());
    		}
    		if(carList.get(i).getVin() != 0) {
    			System.out.print("Vin: ");
    			System.out.println(carList.get(i).getVin());
    		}
    		if(carList.get(i).getHorsepower() != 0) {
    			System.out.print("Horsepower: ");
    			System.out.println(carList.get(i).getHorsepower());
    		}
    		if(carList.get(i).getRearHatchSet()) {
    			System.out.print("Rearhatch: ");
    			System.out.println(carList.get(i).getHasRearHatch());
    		}
    		if(carList.get(i).getNumPassengers() != 0) {
    			System.out.print("Number of passengers: ");
    			System.out.println(carList.get(i).getNumPassengers());
    		}
    		if(carList.get(i).getNumDoors() != 0) {
    			System.out.print("Number of doors: ");
    			System.out.println(carList.get(i).getNumDoors());
    		}
        	}
    	}
    	else System.out.println("Car list empty");
    	System.out.println();
    }
}
