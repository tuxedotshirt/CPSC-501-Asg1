package vehicles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ListManagerTest {
	ListManager listing = new ListManager();
	
	@Test
	void testCreateTruck() {
		listing.createTruck();
		
		assertEquals(1,listing.truckList.size());
						
	    assertEquals("Toyota", listing.truckList.get(0).getMake());
	    		    		
	    assertEquals("4Runner", listing.truckList.get(0).getModel());
	    			    		    			
	    assertEquals(123, listing.truckList.get(0).getVin());
	    		   		
	    assertEquals(4, listing.truckList.get(0).getDriveWheels());
	    		
	    assertEquals(500, listing.truckList.get(0).getCarryingCapacityLbs());
	    		
	    assertEquals(4, listing.truckList.get(0).getNumPassengers());
	    		
	    assertEquals(2, listing.truckList.get(0).getNumDoors());
	    	
	}
	
	@Test
	void testCreateVan() {
		listing.createVan();
		
		assertEquals(1,listing.vanList.size());
						
	    assertEquals("Toyota", listing.vanList.get(0).getMake());
	    		    		
	    assertEquals("Sienna", listing.vanList.get(0).getModel());
	    			    		    			
	    assertEquals(123, listing.vanList.get(0).getVin());
	   
	    assertEquals(true, listing.vanList.get(0).getSlidingDoor());
	    		
	    assertEquals(4, listing.vanList.get(0).getNumPassengers());
	    		
	    assertEquals(2, listing.vanList.get(0).getNumDoors());
	    	
	}
	
	@Test
	void testCreateCar() {
		listing.createCar();
		
		assertEquals(1,listing.carList.size());
						
	    assertEquals("Ford", listing.carList.get(0).getMake());
	    		    		
	    assertEquals("Mustang", listing.carList.get(0).getModel());
	    			    		    			
	    assertEquals(123, listing.carList.get(0).getVin());
	    
	    assertEquals(234, listing.carList.get(0).getHorsepower());
	    
	    assertEquals(true, listing.carList.get(0).getHasRearHatch());
	    
	    assertEquals(4, listing.carList.get(0).getNumPassengers());
	    		
	    assertEquals(2, listing.carList.get(0).getNumDoors());
	    	
	}
	
	@Test
	void testDeleteVehicle() {
		listing.createTruck();
		
		assertEquals(1, listing.truckList.size());
		
		listing.deleteVehicle();
		
		assertEquals(0, listing.truckList.size());
	}
	
	void testSellVehicle() {
		listing.createTruck();
		
		assertEquals(1, listing.truckList.size());
		assertEquals(0, listing.soldVehicles.size());
		
		listing.sellVehicle();
		
		assertEquals(0, listing.truckList.size());
		assertEquals(1, listing.soldVehicles.size());
	}
}
