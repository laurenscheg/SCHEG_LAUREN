import java.util.Scanner;
public class Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the side length:");
		side = kb.nextDouble();
	
		calcSurf();
		print();
	}
	
	public static void calcSurf()
	{
		sa = (6*side*side);
	}
	
	public static void print()
	{
		System.out.println("The surface area of a cube with side " + side + " is " + sa + ".");
	}
}