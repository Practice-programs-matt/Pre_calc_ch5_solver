import java.util.*;
public class Pre_calc_ch5_solver 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your question.");
		String question = scan.nextLine();	
		
		String question_short = question.replaceAll(" ", "");
		//System.out.println(question_short);
		
		int question_short_length = question_short.length();
		
		
		String trig_function = question_short.substring(0,3);
		int variable = Integer.parseInt((question_short.substring(4,question_short_length-1)));
		
		 
		String tan = "tan";
		String sin = "sin";
		String cos = "cos";
		
		//System.out.println(trig_function);
		//System.out.println(variable);
		
		if (trig_function.equalsIgnoreCase(sin))
		{
			Sum_difference.sin(variable);
		}
		
		if (trig_function.equalsIgnoreCase(cos))
		{
			Sum_difference.cos(variable);
		}
		
		if (trig_function.equalsIgnoreCase(tan))
		{
			Sum_difference.tan(variable);
		}
		
		//System.out.println("The solution to your question is");
	}
	
	
}
