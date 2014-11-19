import java.util.Scanner;


public class Question {

	public static void ask()
	{
		int i = 0;
		String question_type = "";
		
		Scanner scan = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter the type of question. Key: \n ha = Half Angle \n sd = Sum & Difference \n pr = Power Reducing \n pts = Product to Sum");
			question_type = scan.nextLine();		
		}
		while( !question_type.equalsIgnoreCase("sd") && !question_type.equalsIgnoreCase("pr") && !question_type.equalsIgnoreCase("ha") && !question_type.equalsIgnoreCase("pts"));
		
		if (question_type.equalsIgnoreCase("sd"))
		{
			Sum_difference.ask();
		}
		
		else if (question_type.equalsIgnoreCase("pts"))
		{
			Product_to_sum.ask();
		}
		
		else if (question_type.equalsIgnoreCase("ha"))
		{
			Half_angle.ask();
		}
		
		
		
	
		
		
	}
	
}
