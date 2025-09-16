// Student Name 	: Joseph Lalor
// Student Id Number: 
// Date 			: 16/09/25
// Purpose 			:

public class ThermTest2
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method
		double tempB;				
		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class
		Thermometer thermB = new Thermometer(10.0); // Create another instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		// assign return value of getCelsius to a variable
		tempB = thermB.getCelsius();
		System.out.println("Temp. of Thermometer B is " + tempB);				
		
	} // end main
} // end class ThermTest
