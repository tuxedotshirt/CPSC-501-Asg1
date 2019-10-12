package vehicles;

public class Vehicle {

		private int vin = 0;
		private String make = null;
		private String model = null;
		private int numPassengers = 0;
		private int numDoors = 0;
		public String owner = null;
		public String licencePlate = null;
				
		public int getVin() {
			return vin;
		}

		public void setVin(int number) {
			vin = number;
		}
		
		public String getMake() {
			return make;
		}

		public void setMake(String manufacturer) {
			make = manufacturer;
		}
		
		public String getModel() {
			return model;
		}
	
		public void setModel(String modelName) {
			model = modelName;
		}

		public int getNumPassengers() {
			return numPassengers;
		}

		public void setNumPassengers(int numPass) {
			numPassengers = numPass;
		}

		public int getNumDoors() {
			return numDoors;
		}
		
		public void setNumDoors(int numOfDoors) {
			numDoors = numOfDoors;
		}
	}
