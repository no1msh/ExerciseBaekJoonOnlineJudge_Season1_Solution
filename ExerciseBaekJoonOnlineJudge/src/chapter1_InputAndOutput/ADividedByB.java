package chapter1_InputAndOutput;

import java.util.Scanner;
public class ADividedByB 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		
		double equals = A / (double)B;
		
		System.out.print(equals);
	}
}
