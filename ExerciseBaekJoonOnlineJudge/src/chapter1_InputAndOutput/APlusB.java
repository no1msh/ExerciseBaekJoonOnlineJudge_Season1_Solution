package chapter1_InputAndOutput;

import java.util.Scanner;
public class APlusB 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		
		int sum = A + B;
		
		System.out.print(sum);
	}
}