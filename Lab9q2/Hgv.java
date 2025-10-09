

public class Hgv extends RoadVehicle implements ImportDuty
{
	private int cargo;

	public Hgv(){ 	
		this(0,0,0);	
	}

	public Hgv(int c, int w, int p){ 
		super(w, p);
		setCargo(c);
	}

	public void setCargo(int size){
		cargo = size;
		}

	public int getCargo(){
		return cargo;
		}	
	
	public void calculateDuty()
		{
			System.out.println("Import duty: " + super.getWheels() * getCargo() * HGVTAXRATE);
		}
}
