
public class Car extends RoadVehicle implements ImportDuty{
	private String carType;
 
	public Car() {
	 	this("", 0, 0);
	 	}
 
	public Car(String c, int w, int p) { 
		super(w, p);
		setType(c);
	}
 
	public void setType(String t)  {
		carType = t;
	}
 
	public String getType() {
		return carType;
	}

	public void calculateDuty()
		{
			System.out.println("Import duty: " + super.getWheels() * CARTAXRATE);
		}
}
