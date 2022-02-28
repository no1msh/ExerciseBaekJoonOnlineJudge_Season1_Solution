package chapter1_input_and_output;

import java.util.Scanner;
public class No_10869 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		
		int plus = A + B;
		int minus = A - B;
		int times = A * B;
		int dividedBy = A / B;
		int remainder = A % B;
		
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(times);
		System.out.println(dividedBy);
		System.out.print(remainder);
	}
}
