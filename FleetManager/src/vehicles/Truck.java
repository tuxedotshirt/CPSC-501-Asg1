package vehicles;

public class Truck extends Vehicle{
	private int carryingCapacityLbs = 0;
	private int driveWheels = 0;
	
	public int getCarryingCapacityLbs() {
		return carryingCapacityLbs;
	}
	public void setCarryingCapacityLbs(int carryingCapacity) {
		carryingCapacityLbs = carryingCapacity;
	}
	public int getDriveWheels() {
		return driveWheels;
	}
	public void setDriveWheels(int driveWhls) {
		driveWheels = driveWhls;
	}
	
}
