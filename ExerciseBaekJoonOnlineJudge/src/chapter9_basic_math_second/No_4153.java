package chapter9_basic_math_second;

import java.io.*;

public class No_4153 
{
	static void printResult(boolean condition)
	{
		if (condition)
			System.out.println("right");
		else
			System.out.println("wrong");		
	}
	
	public static void main(String[] args) throws IOException 
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputStr;
		int a, b, c;

		while (true) {
			inputStr = br.readLine().split(" ");
			a = Integer.parseInt(inputStr[0]);
			b = Integer.parseInt(inputStr[1]);
			c = Integer.parseInt(inputStr[2]);

			if (a == 0 && b == 0 && c == 0)
				break;
				
			if (a > b && a > c) 
				printResult(a*a == b*b + c*c);
	
			else if (b > a && b > c) 
				printResult(b*b == a*a + c*c);
				
			else 
				printResult(c*c == a*a + b*b);
							
		}
	}
}