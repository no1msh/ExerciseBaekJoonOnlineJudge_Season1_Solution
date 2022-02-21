package chapter4_while;

import java.util.Scanner;

public class No_10952 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner( System.in);
		
		do 
		{
			int a = in.nextInt();
			int b = in.nextInt();
			int sum = a+b;
			
			if (a == 0 && b == 0)
				break;
			System.out.println(sum);
			
		} while (true); 
			
	}

}
