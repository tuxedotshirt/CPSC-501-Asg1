package vehicles;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

public class InventoryManagerTest {
	List<Truck> truckList = new ArrayList<Truck>();
	Scanner scanner;
	
	@Test
	public void testListSize() {
		List<Truck> truckList = new ArrayList<Truck>();
		List<Object> paramList = new ArrayList<Object>();
		paramList.add(1);
		paramList.add("Toyota");
		paramList.add("4Runner");
		paramList.add(4);
		paramList.add(500);
		paramList.add(2);
		paramList.add(4);
		
		addTruck(truckList, paramList);
		
		paramList = new ArrayList<Object>();
		paramList.add(2);
		paramList.add("Toyota");
		paramList.add("4Runner");
		paramList.add(4);
		paramList.add(500);
		paramList.add(2);
		paramList.add(4);
		
		addTruck(truckList, paramList);
		
		assertEquals(2, truckList.size());
	}

	@Test
	public void testListValues() {
		List<Truck> truckList = new ArrayList<Truck>();
		List<Object> paramList = new ArrayList<Object>();
		paramList.add(3);
		paramList.add("Toyota");
		paramList.add("5Runner");
		paramList.add(4);
		paramList.add(500);
		paramList.add(2);
		paramList.add(5);
		
		addTruck(truckList, paramList);
		
		int i = (int) truckList.get(0).getVin();
		int wheels = (int) truckList.get(0).getDriveWheels();
		int cap = truckList.get(0).getCarryingCapacityLbs();
		int drs = truckList.get(0).getNumDoors();
		int px = truckList.get(0).getNumPassengers();
		String make = truckList.get(0).getMake();
		String model = truckList.get(0).getModel();
		
		assertEquals(3, i);
		assertEquals("Toyota", make);
		assertEquals("5Runner", model);
		assertEquals(4, wheels);
		assertEquals(500, cap);
		assertEquals(2, drs);
		assertEquals(5, px);
	}
	
	private static void addTruck(List<Truck> truckList, List<Object> paramList) {
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
}
