package chapter4_while;

import java.util.Scanner;

public class No_10951 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		while (in.hasNext())	// hasNext() 메소드를 통해 EOF를 대비할 수 있다.
		{
			int a = in.nextInt();
			int b = in.nextInt();
			
			int sum = a+b;
			
			System.out.println(sum);
			
		}
	}
}