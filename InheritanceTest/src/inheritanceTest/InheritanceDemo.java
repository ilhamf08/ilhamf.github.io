package inheritanceTest;

public class InheritanceDemo {
	public static void main(String[] args) {
//		TODO Auto-generated method stub
		Car Toyota = new Car(4, 5, false);
		Convertible Chevrolet = new Convertible(4, 4, false, "Convertible");
		Bike Vespa = new Bike(2, "Scooter");
		Sportbike Ducati = new Sportbike(2, "Sport", "Metallic Black");
			
//		Demo Car Class
		System.out.println(
				"Number of Doors on Toyota's Car: " +
				Toyota.getNumDoors());
		System.out.println(
				"Number of Wheels on Toyota's Car: " +
				Toyota.getWheels());
		String electric;
		electric = Toyota.getIsElectric() ? "yes" : " no";
		System.out.println(
				"Is the Toyota's Car electric?" +
				electric);
		System.out.println();
		
//		Demo Convertible Class
		System.out.println(
				"Number of Doors on Chevrolet's Car: " +
				Chevrolet.getNumDoors());
		System.out.println(
				"Number of Wheels on Chevrolet's Car: " +
				Chevrolet.getWheels());
		electric = Chevrolet.getIsElectric() ? "yes" : " no";
		System.out.println(
				"Is the Chevrolet's Car electric?" +
				electric);
		System.out.println(
				"Type of Chevrolet's Car Roof: " +
				Chevrolet.getRoofType());
		System.out.println();
		
		
//		Demo Bike Class
		System.out.println(
				"Number of Wheels on Vespa's Bike: " +
				Vespa.getWheels());
		System.out.println(
				"Type of Vespa's Bike: " +
				Vespa.getBikeType());
		System.out.println();
		
//		Demo Sportbike Class
		System.out.println(
				"Number of Wheels on Ducati's Bike: " +
				Ducati.getWheels());
		System.out.println(
				"Type of Ducati's Bike: " +
				Ducati.getBikeType());
		System.out.println(
				"Color of Ducati's Bike: " +
				Ducati.getColor());
		System.out.println();

	}
}
