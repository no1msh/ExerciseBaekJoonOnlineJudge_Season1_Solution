package chapter3_for;

import java.util.Scanner;
public class No_8393 
{
	// n이 주어졌을 때 , 1부터 n까지 합을 구하는 프로그램을 구하시오.
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int sum = 0;
		
		for (int i = 1 ; i <= n ; i++)
			sum += i;
		
		System.out.print(sum);
	}

}