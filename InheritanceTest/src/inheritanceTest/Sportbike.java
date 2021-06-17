package inheritanceTest;

public class Sportbike extends Bike {
	private String color;
	
	public Sportbike(int numWheels, String bikeType, String color) {
		super(numWheels, bikeType);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}
