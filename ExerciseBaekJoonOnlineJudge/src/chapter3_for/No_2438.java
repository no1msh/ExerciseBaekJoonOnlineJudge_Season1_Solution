package chapter3_for;

import java.util.Scanner;

public class No_2438 
{
	// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for (int i = 0 ; i < n ; i++)
		{
			for ( int j = 0 ; j <= i ; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
