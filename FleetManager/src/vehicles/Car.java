package vehicles;

public class Car extends Vehicle{
	private int horsepower = 0;
	private boolean rearHatchSet = false;
	private boolean hasRearHatch = false;
	
	public int getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(int hrspwr) {
		horsepower = hrspwr;
	}
	public boolean isHasRearHatch() {
		return hasRearHatch;
	}
	public void setHasRearHatch(boolean hasRearHat) {
		hasRearHatch = hasRearHat;
		rearHatchSet = true;
	}
	public boolean getHasRearHatch() {
		return hasRearHatch;
	}
	public boolean getRearHatchSet() {
		return rearHatchSet;
	}
	
	
	
}
