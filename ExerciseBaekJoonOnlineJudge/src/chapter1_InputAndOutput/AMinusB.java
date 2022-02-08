package chapter1_InputAndOutput;

import java.util.Scanner;
public class AMinusB 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		
		int equals = A - B;
		
		System.out.print(equals);
	}
}
