import java.util.Scanner;
public class Underscores
{
	static String sentence;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		sentence = kb.nextLine();
		replace();
	}
	
	public static void replace()
	{
		if (sentence.indexOf(" ")>0)
		{
			sentence = sentence.substring(0, sentence.indexOf(" ")) + "_" + sentence.substring(sentence.indexOf(" ") + 1);
			replace();
			
		}
		else 
			System.out.println(sentence);
		

	}
}