
public class Sum_difference 
{

	
	public static void ask()
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
			System.out.println("Tan has a period of 2\u03c0 which equals 360°, because of this you can substract 360° from "+ x +" and you will get " + (x-360));
			x= x-360;
		}
		while  ((trig_function.equals("cos") || trig_function.equals("cos")) && x >= 180) 
		{
			System.out.println(trig_function + " has a period of \u03c0 which equals 180°, because of this you can substract 180° from "+ x +" and you will get " + (x-180) + "°");
			x= x-180;
		}
		//check to see if the values are easily know on the unit circle
		
				if ( x == 0 || x ==30  || x == 45 || x == 60 || x == 90 || x == 120 || x == 135 || x == 150 || x == 180 || x == 210 || x == 225 || x == 240 || x == 270 || x == 300 || x == 315 || x == 330 )  // need to add rest of known values
				{
					System.out.println("This value is easily found on the unit circle, " + trig_function + "(" + x + ") is equal to " + unit_circle_string_value(trig_function,x));
				}
				
				////////////////
		
			
		return reactants;
		
	}


	public static String unit_circle_string_value(String trig_function,int x)
	{
		String string_value = "";
		String string_value_cos = "";
		String string_value_sin = "";
		String string_value_tan = "";
		double num_value_cos = 0;
		double num_value_sin = 0;
		double num_value_tan = 0;
		
		
		//if (trig_function.equalsIgnoreCase("cos"))
		//{
			
			
			if (x == 0)//cos = 0 /360
			{
				string_value_cos = "1" ; 
				num_value_cos = 1;
				
				string_value_sin = "1" ; 
				num_value_sin = 1;
				
				string_value_sin = "1" ; 
				num_value_sin = 1;
			}
			
			if (x == 30)  //cos = 30
			{
				string_value_cos = "(\u221A" + 3 + ")" + "/2" ;
				num_value_cos = Math.sqrt(3)/2;
			}
			
			if (x == 45)//cos = 45
			{
				string_value_cos = "(\u221A" + 2 + ")" + "/2" ;
				num_value_cos =  Math.sqrt(2)/2;
			}
			if (x == 60)//cos = 60
			{
				string_value_cos = "1/2";
				num_value_cos = .5;
			}
			
			if (x == 90)//cos = 90
			{
				string_value_cos = "0";
				num_value_cos = 0;
			}
			//not done
			if (x == 120)//cos = 120
			{
				string_value_cos = "1/2" ;
				num_value_cos = -.5;
			}
			
			if (x == 135)//cos = 135
			{
				string_value_cos = "-(" + "\u221a" + 2 + ")" + "/2" ;
				num_value_cos =  -Math.sqrt(2)/2;
			}
			if (x == 150)//cos = 150
			{
				string_value_cos = "-(" + "\u221a" + 3 + ")" + "/2" ;
				num_value_cos =  -Math.sqrt(3)/2;
			}
			
			if (x == 180)//cos = 180
			{
				string_value_cos = "-1/2";
				num_value_cos = -.5;
			}
			
			
			
			
	
			return string_value_cos;
		/*if (trig_function.equalsIgnoreCase("cos"))
		{
			return string_value_cos;
		}
		
		if (trig_function.equalsIgnoreCase("sin"))
		{
			return string_value_sin;
		}
		
		if (trig_function.equalsIgnoreCase("tan"))
		{
			return string_value_tan;
		}
		
	*/
	}
	
	public static int nit_circle_num_value(String trig_function, int num_value)
	{
		
		unit_circle_string_value(trig_function,num_value);
		return num_value;
	}

}
