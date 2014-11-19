

public class Sum_difference 
{

	public static void sin(int variable)
	{
		String trig_function = "sin";
		
	}
	
	public static void cos(int variable)
	{
		String trig_function = "cos";
		
		get_reactants(variable,trig_function);
		
	}
	
	public static void tan(int variable)
	{
		String trig_function = "tan";
		
	}
	
	public static String get_reactants(int x,String trig_function)
	{
	
		
		
		String reactants = "";
		
		
		
		while  (trig_function.equals("tan") && x >= 360) 
		{
			System.out.println("Tan has a period of 2π which equals 360°, because of this you can substract 360° from "+ x +" and you will get " + (x-360));
			x= x-360;
		}
		while  ((trig_function.equals("cos") || trig_function.equals("cos")) && x >= 180) 
		{
			System.out.println(trig_function + " has a period of π which equals 180°, because of this you can substract 360° from "+ x +" and you will get " + (x-180));
			x= x-180;
		}
		//check to see if the values are easily know on the unit circle
		
				if ( x == 0 || x ==30  || x == 45 || x == 60 || x == 120 || x == 135 || x == 150 || x == 180 || x == 210 || x == 225 || x == 240 || x == 270 || x == 300 || x == 315 || x == 330 )  // need to add rest of known values
				{
					System.out.println("This value is easily found on the unit circle as " + trig_function + "(" + x + ") is equal to " + unit_circle_value(trig_function,x));
				}
				
				////////////////
		
			
		return reactants;
		
	}


	public static String unit_circle_value(String trig_function,int x)
	{
		
		String value = "";
		
		if (trig_function.equalsIgnoreCase("cos"))
		{
			double cos_calc = Math.cos(x);
			//System.out.println(cos_calc);
			
			if (cos_calc == 1)//cos = 0 /360
			{
				value = "1" ;
			}
			
			if (cos_calc == 0.15425144988758405)//cos = 30
			{
				value = "(" + "\u221a" + 3 + ")" + "/2" ;
			}
			
			if (cos_calc == 0.5253219888177297)//cos = 45
			{
				value = "(" + "\u221a" + 2 + ")" + "/2" ;
			}
			if (cos_calc == -0.9524129804151563)//cos = 60
			{
				value = "1/2";
			}
			
			if (cos_calc == -0.9524129804151563)//cos = 180
			{
				value = "0";
			}
			//not done
			if (cos_calc == 0.15425144988758405)//cos = 120
			{
				value = "(" + "\u221a" + 3 + ")" + "/2" ;
			}
			
			if (cos_calc == 0.5253219888177297)//cos = 135
			{
				value = "(" + "\u221a" + 2 + ")" + "/2" ;
			}
			if (cos_calc == -0.9524129804151563)//cos = 150
			{
				value = "1/2";
			}
			
			if (cos_calc == -0.9524129804151563)//cos = 180
			{
				value = "1/2";
			}
			/////////////
			if (cos_calc == 0.15425144988758405)//cos = 210
			{
				value = "(" + "\u221a" + 3 + ")" + "/2" ;
			}
			
			if (cos_calc == 0.5253219888177297)//cos = 225
			{
				value = "(" + "\u221a" + 2 + ")" + "/2" ;
			}
			if (cos_calc == -0.9524129804151563)//cos = 240
			{
				value = "1/2";
			}
			
			if (cos_calc == -0.9524129804151563)//cos = 270
			{
				value = "1/2";
			}
			////////////
			if (cos_calc == 0.15425144988758405)//cos = 300
			{
				value = "(" + "\u221a" + 3 + ")" + "/2" ;
			}
			
			if (cos_calc == 0.5253219888177297)//cos = 315
			{
				value = "(" + "\u221a" + 2 + ")" + "/2" ;
			}
			if (cos_calc == -0.9524129804151563)//cos = 330
			{
				value = "1/2";
			}
			
			
			
		}
		return value;
	}


}
