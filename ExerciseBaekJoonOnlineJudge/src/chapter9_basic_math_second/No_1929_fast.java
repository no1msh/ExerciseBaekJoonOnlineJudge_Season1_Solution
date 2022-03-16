package chapter9_basic_math_second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1929_fast 
{
//  에라토스테네스의 체를 이용하여 최대한 빠르게 소수를 판단해보자. Big(n)
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] inputArr = br.readLine().split(" ");
		
		int m = Integer.parseInt(inputArr[0]);
		int n = Integer.parseInt(inputArr[1]);
		
		for (int i = m ; i <= n ; i++)
		{
			if ( i == 1) continue;
			if ( i != 2 && i % 2 ==0) continue;
			if ( i != 3 && i % 3 ==0) continue;
			if ( i != 5 && i % 5 ==0) continue;
			if ( i != 7 && i % 7 ==0) continue;
			
			
			sb.append(i).append("\n");
		}
		
		System.out.print(sb.toString());
	}

}