package chapter1_input_and_output;

import java.util.Scanner;

public class No_2588 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		System.out.println(num1*(num2%10)); // num2의 1의자리만 남기고 num1과 곱함.
		System.out.println(num1*(num2%100/10)); // num2의 10의 자리만 남기고 num1과 곱함.
		System.out.println(num1*(num2/100));	// num2의 100의자리만 남기고 num1과 곱함 
		System.out.print(num1*num2);
	}

}
