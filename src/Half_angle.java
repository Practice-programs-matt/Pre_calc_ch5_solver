import java.util.Scanner;
import java.util.*;


public class Half_angle 
{
	
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
		
		Half_angle.solve(question);
	}
	
	//acesses other methods and solves the question with step by step walkthrough
	public static void solve(String question)
	{
		
		int add_function = 0;
		int sub_function = 0;
		String string_a = find_a(question);
		String string_b = find_b(question);
		
		int var_a = find_a_num(question);        //finds value not including x of first function
		int var_b = find_b_num(question);        //finds value not including x of second function
		
		
		
		String function_1 = function_1(question);   //finds the trig operator of the first function
		String function_2 = function_2(question);   //finds the trig operator of the second function
		
		//check to make sure question is valid if not will start over
		if (!(function_1.equalsIgnoreCase("sin") || function_1.equalsIgnoreCase("cos") || function_1.equalsIgnoreCase("tan") || function_2.equalsIgnoreCase("sin") || function_2.equalsIgnoreCase("cos") || function_2.equalsIgnoreCase("tan")) )
		{
			error();
		}
		
		//checking to see what equation to use
		
		if (function_1.equalsIgnoreCase("sin") && function_2.equalsIgnoreCase("sin"))
		{
			System.out.println("Step 1:  (1/2)[(cos(" +string_a + "-" + string_b + ")) - (cos(" + string_a + "+" + string_b +"))]");  //prints first step
			add_function = var_a + var_b;
			sub_function = var_a - var_b;
			
	
			System.out.println("\nStep 2:  (1/2)[cos("  + sub_function + "x) - cos(" + add_function + "x)]");  // uses x a literal instead of from string because they are always there and substracts both halfs
			
			System.out.println("\nStep 3:  (1/2)cos(" + sub_function + "x) - (1/2)cos(" + add_function + "x)");
		}
		
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
		
		int a = 0;
		
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
		int b = 0;
		
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
		int first_par = 0;
		int second_par = question.indexOf(")");
		int third_par = question.indexOf("(", second_par);
		
		String function_2 = question.substring(second_par+1,third_par);
		
		return function_2;
	}
	
	public static void error()
	{
		System.out.println("I'm sorry there has been an error, yoy may have entered an invalid question. Please Try again. ");
		ask();
	}
}
