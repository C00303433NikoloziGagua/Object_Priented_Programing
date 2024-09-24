
public class ThermB
{ 
	private static double celsius;	
	
	public ThermB()		
	{	
		setCelsius(0);		
	}
		
	public ThermB(double cel)	
	{
		setCelsius(cel);
	}

	public static void setCelsius(double cel)
	{
		celsius = cel;		
	}

	public static double getCelsius()
	{
		return celsius;
	}

	}

