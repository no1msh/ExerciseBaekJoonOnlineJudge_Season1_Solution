package chapter8_basic_math_first;

import java.util.Scanner;

public class No_2292
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int sum = 1;
		int plusNum = 6;
		int floor = 1;
		
		while ( n > sum)
		{
			sum += plusNum;
			plusNum += 6;
			floor++;
		}
		
		System.out.print(floor);
	}

}