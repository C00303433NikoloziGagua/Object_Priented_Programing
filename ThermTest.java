// Student Name 	: Nikolozi Gagua
// Student Id Number: C00303433
// Date 			: 19/09/2023
// Purpose 			: Lab 1

public class ThermTest
{ // begin class ThermTest
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		ThermB.setCelsius(10.0);
		System.out.println("Temp. of Thermometer B is " + ThermB.getCelsius() );
		
	} // end main
} // end class ThermTest