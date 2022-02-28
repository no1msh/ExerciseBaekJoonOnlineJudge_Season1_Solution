package chapter1_input_and_output;

import java.util.Scanner;
public class No_1000 
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