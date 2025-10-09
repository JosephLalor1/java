
public class CarTest{
	
	public static void main(String args[]){
		
		Car car1 = new Car();
		
		car1.setWheels(4);
		car1.setPass(6);
		car1.setType("saloon");

		System.out.println("Car1: ");
		System.out.print("Wheels: " + car1.getWheels());
		System.out.print(" Passengers: " + car1.getPass());
		System.out.println(" Type: " + car1.getType());
		car1.calculateDuty();

		Hgv hgv1 = new Hgv();
		
		hgv1.setWheels(4);
		hgv1.setPass(6);
		hgv1.setCargo(30);

		System.out.println("Car1: ");
		System.out.print("Wheels: " + hgv1.getWheels());
		System.out.print(" Passengers: " + hgv1.getPass());
		System.out.println(" Cargo: " + hgv1.getCargo());
		hgv1.calculateDuty();
	}
}
