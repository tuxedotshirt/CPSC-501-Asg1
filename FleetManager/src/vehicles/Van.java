package vehicles;

public class Van extends Vehicle{
	private boolean slidingDoorSet = false;
	private boolean slidingDoor = false;
	
	public boolean getSlidingDoor() {
		return slidingDoor;
	}
	public void setSlidingDoor(boolean slidingDr) {
		slidingDoor = slidingDr;
		slidingDoorSet = true;
	}
	public boolean getSlidingDoorSet() {
		return slidingDoorSet;
	}
	
}
