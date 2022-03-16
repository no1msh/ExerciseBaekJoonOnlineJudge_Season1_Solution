package chapter9_basic_math_second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class No_1929 
{
//  에라토스테네스의 체를 사용하여 소수를 출력하라
	
	static boolean isPrime (int inputNum)
	{
		if (inputNum == 1) return false;
		if (inputNum != 2 && inputNum%2==0) return false;
		if (inputNum != 3 && inputNum%3==0) return false;
		if (inputNum != 5 && inputNum%5==0) return false;
		if (inputNum != 7 && inputNum%7==0) return false;
		
		for (int i = 2 ; i*i <= inputNum ; i++)
		{
			if(inputNum % i == 0) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputArr = br.readLine().split(" ");
		br.close();
		
		int m = Integer.parseInt(inputArr[0]);
		int n = Integer.parseInt(inputArr[1]);
		
		for (int i = m ; i <= n; i++)
		{
			if ( isPrime(i))
				System.out.println(i);
		}
	}
}