package vehicles;

public class Registration {
	private static String ownerName = null;
	private static String licencePlate = null;
	
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		Registration.ownerName = ownerName;
	}
	
	public String getLicencePlate() {
		return licencePlate;
	}

	public void setLicencePlate(String plate) {
		licencePlate = plate;
	}
}
