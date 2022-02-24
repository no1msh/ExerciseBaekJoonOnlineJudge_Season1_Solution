package chapter5_array;

import java.util.Scanner;

public class No_4344 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int testCase = in.nextInt();
		
		for ( int i = 0 ; i < testCase; i++)
		{
			int n = in.nextInt();
			
			int[] classGrade = new int[n];
			int sum = 0;
			double average = 0.0;
			int count = 0;
			for (int j = 0 ; j < classGrade.length; j++)
			{
				classGrade[j] = in.nextInt();
				sum+= classGrade[j];
			}
			average = sum / (double) n;
			
			for ( int value : classGrade)
			{
				if ( value > average)
					count++;
					
			}
			System.out.printf("%.3f%%\n", count/(double)n*100);	// %를 입력하고 싶으면 %를 두번 입력해줍니다.
		}
	}

}
