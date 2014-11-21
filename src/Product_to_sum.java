import java.util.Scanner;


public class Product_to_sum {

	public static void ask()
	{
		int i = 0;
		String question = "";
		Scanner scan = new Scanner(System.in);
		do 
		{
			System.out.println("Enter your question. Please use x as your variable");
			question = scan.nextLine();	
		}
		while (i!=0);
		
		Product_to_sum.solve(question);
	}
	
	//acesses other methods and solves the question with step by step walkthrough
	public static void solve(String question)
	{
		
		int add_function = 0;
		int sub_function = 0;
		
		String string_alpha = find_a(question);        //finds the value of first input including x
		String string_beta = find_b(question);        //finds the value of second input including x
		
		int var_alpha = find_a_num(question);        //finds value as integer not including x, of first function
		int var_beta = find_b_num(question);        //finds value as integer not including x, of second function
		
		System.out.println(var_beta);
		
		String function_1 = function_1(question);   //finds just the trig operator of the first function  only used to check what type of equation
		String function_2 = function_2(question);   //finds just the trig operator of the second function
		
		//check to make sure question is valid if not will start over
		if (!(function_1.equalsIgnoreCase("sin") || function_1.equalsIgnoreCase("cos") || function_1.equalsIgnoreCase("tan") || function_2.equalsIgnoreCase("sin") || function_2.equalsIgnoreCase("cos") || function_2.equalsIgnoreCase("tan")) )
		{
			error();
		}
		
		//checking to see what equation to use
		
		if (function_1.equalsIgnoreCase("sin") && function_2.equalsIgnoreCase("sin"))
		{
			System.out.println("Step 1:  (1/2)[(cos(" + string_alpha + "-" + string_beta + ")) - (cos(" + string_alpha + "+" + string_beta +"))]");  //prints first step
			
			add_function = var_alpha + var_beta;  //adds the two values as integer
			sub_function = var_alpha - var_beta;	//substracts the two values as integers
			
			String string_alpha2 = add_function +"x";    //reasigns string including x after substracting two values
			String string_beta2 = sub_function +"x";	//reasigns string including x after substracting two values

			System.out.println("\nStep 2:  (1/2)[cos("  + string_beta2 + ") - cos(" + string_alpha2 + ")]");  // uses x a literal instead of from string because they are always there and substracts both halfs
			
			System.out.println("\nStep 3:  (1/2)cos(" + string_beta2 + ") - (1/2)cos(" + string_alpha2 + ")");
			
			finished();
			
		}
		
		if (function_1.equalsIgnoreCase("sin") && function_2.equalsIgnoreCase("cos"))
		{
			System.out.println("Step 1:  (1/2)[(cos(" + string_alpha + "+" + string_beta + ")) - (cos(" + string_alpha + "-" + string_beta +"))]\t\tenter values into equation");  //prints first step
			
			add_function = var_alpha + var_beta;  //adds the two values as integer
			sub_function = var_alpha - var_beta;	//substracts the two values as integers
			
			String string_alpha2 = add_function +"x";    //reasigns string including x after substracting two values
			String string_beta2 = sub_function +"x";	//reasigns string including x after substracting two values

			System.out.println("\nStep 2:  (1/2)[cos("  + string_alpha2 + ") + cos(" + string_beta2 + ")]\t\tsimplify values");  // uses x a literal instead of from string because they are always there and substracts both halfs
			
			System.out.println("\nStep 3:  (1/2)cos(" + string_alpha2 + ") + (1/2)cos(" + string_beta2 + ") t\tdistribute 1/2");
			
			finished();
			
		}
		//not done
		if (function_1.equalsIgnoreCase("cos") && function_2.equalsIgnoreCase("cos"))
		{
			System.out.println("Step 1:  (1/2)[(cos(" + string_alpha + "+" + string_beta + ")) - (cos(" + string_alpha + "-" + string_beta +"))]\t\tenter values into equation");  //prints first step
			
			add_function = var_alpha + var_beta;  //adds the two values as integer
			sub_function = var_alpha - var_beta;	//substracts the two values as integers
			
			String string_alpha2 = add_function +"x";    //reasigns string including x after substracting two values
			String string_beta2 = sub_function +"x";	//reasigns string including x after substracting two values

			System.out.println("\nStep 2:  (1/2)[cos("  + string_alpha2 + ") + cos(" + string_beta2 + ")]\t\tsimplify values");  // uses x a literal instead of from string because they are always there and substracts both halfs
			
			System.out.println("\nStep 3:  (1/2)cos(" + string_alpha2 + ") + (1/2)cos(" + string_beta2 + ") t\tdistribute 1/2");
			
			finished();
			
		}
		
		////////////
		//System.out.println(function_1 + " " + function_2);
		
		
		
		
		//find_b(question);
	}
	
	////finds the value of the first varaible including x and exports as a string
	public static String find_a(String question)
	{
		
		int first_par = 0;
		int second_par = 0;
		
		String a = "";
		
		first_par = question.indexOf("(");
		second_par = question.indexOf(")");
		
		a = question.substring(first_par+1,second_par);
		
		
		return a;
	}
	
////finds the value of the second varaible including x and exports as a string
	public static String find_b(String question)
	{
		int first_par = 0;
		int second_par = 0;
		int third_par = 0;
		int fourth_par = 0;
		String b = "";
		
		first_par = question.indexOf("(");
		second_par = question.indexOf(")");
		
		
		third_par = question.indexOf("(", second_par+1);
		fourth_par = question.indexOf(")", second_par+1);
		
		b = question.substring(third_par + 1,fourth_par);
		
		return b;
	}
	
////finds the value of the first varaible not including x and exports as a string
	public static int find_a_num(String question)
	{
		
		int first_par = 0;
		int second_par = 0;
		
		int a;
		
		first_par = question.indexOf("(");
		second_par = question.indexOf("x");
		
		
		a = Integer.parseInt(question.substring(first_par+1,second_par));
		
		
		return a;
	}

	////finds the value of the second varaible not including x and exports as a string
	public static int find_b_num(String question)
	{
		int first_par = 0;
		int second_par = 0;
		int third_par = 0;
		int fourth_par = 0;
		int b;
		
		first_par = question.indexOf("(");
		second_par = question.indexOf("x");
		
		
		third_par = question.indexOf("(", second_par+1);
		fourth_par = question.indexOf("x", second_par+1);
		
		b = Integer.parseInt(question.substring(third_par + 1,fourth_par));
		
		return b;
	}
	///// returns the trig function of the equation purely for walk through
	public static String function_1(String question)
	{
		
		int first_par = question.indexOf("(");
		
		String function_1 = question.substring(0, first_par);
		
		return function_1;
	}

	///// returns the trig function of the equation purely for walk through
	public static String function_2(String question)
	{
		//int first_par = 0;
		//int second_par = question.indexOf(")");
		//int third_par = question.indexOf("(", second_par);
		
		String function_2 = question.substring(find_par(2,question)+1,find_par(3,question));
		
		return function_2;
	}
	

	public static void sin_sin(String string_alpha,String string_beta,int var_alpha,int var_beta) // executes if the equation is in form sina*sinb
	{
		System.out.println("Step 1:  (1/2)[(cos(" + string_alpha + "-" + string_beta + ")) - (cos(" + string_alpha + "+" + string_beta +"))]");  //prints first step
		
		int add_function = var_alpha + var_beta;  //adds the two values as integer
		int sub_function = var_alpha - var_beta;	//substracts the two values as integers
		
		String string_alpha2 = add_function +"x";    //reasigns string including x after substracting two values
		String string_beta2 = sub_function +"x";	//reasigns string including x after substracting two values

		System.out.println("\nStep 2:  (1/2)[cos("  + string_beta2 + ") - cos(" + string_alpha2 + ")]");  // uses x a literal instead of from string because they are always there and substracts both halfs
		
		System.out.println("\nStep 3:  (1/2)cos(" + string_beta2 + ") - (1/2)cos(" + string_alpha2 + ")");
		
		finished();
	}
	
	
	public static void sin_cos(String string_alpha,String string_beta,int var_alpha,int var_beta) // executes if the equation is in form sina*cosb
	{
		System.out.println("Step 1:  (1/2)[(cos(" + string_alpha + "+" + string_beta + ")) - (cos(" + string_alpha + "-" + string_beta +"))]\t\tenter values into equation");  //prints first step
		
		int add_function = var_alpha + var_beta;  //adds the two values as integer
		int sub_function = var_alpha - var_beta;	//substracts the two values as integers
		
		String string_alpha2 = add_function +"x";    //reasigns string including x after substracting two values
		String string_beta2 = sub_function +"x";	//reasigns string including x after substracting two values

		System.out.println("\nStep 2:  (1/2)[cos("  + string_alpha2 + ") + cos(" + string_beta2 + ")]\t\tsimplify values");  // uses x a literal instead of from string because they are always there and substracts both halfs
		
		System.out.println("\nStep 3:  (1/2)cos(" + string_alpha2 + ") + (1/2)cos(" + string_beta2 + ") t\tdistribute 1/2");
		
		finished();
	}
	
	public static int find_par(int par_number, String question)
	{
		int par_location = 0;  // location of the latest par
		int location = 0;
		int m =0;
		
		while (par_location <=par_number)
		{
			if (par_number %2 == 0)
			{
				location = question.indexOf("(", location +1);
			}
			else
			{
				location = question.indexOf("x", location+1);
			}		
		}
		
		return location;
	}
	

	public static void finished()
	{
		System.out.println("Problem Solved! \n Enter another problem [Y/N]>>>>>>>>>>>");
		
		Scanner scan2 = new Scanner(System.in);
		String response = scan2.nextLine();
		
		if (response.equalsIgnoreCase("Y"))
		{
			Question.ask();
		}
		else
		{
			
		}
		
	}
	
	public static void error()
	{
		System.out.println("I'm sorry there has been an error, yoy may have entered an invalid question. Please Try again. ");
		ask();
	}
	
}
