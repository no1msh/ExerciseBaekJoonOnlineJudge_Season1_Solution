package chapter9_basic_math_second;

import java.io.*;

public class No_4948 
{
	static boolean isPrime(int inputNum) {
		if (inputNum == 1) return false;
		
		for (int i = 2; i*i <= inputNum; i++)
			if(inputNum % i == 0) return false;
		
		return true;
	}
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		StringBuffer sb = new StringBuffer();
		int n = 0;
		int count = 0;
		
		while( true )
		{
			n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			
			count = 0;
			for(int i = n+1; i<= 2*n; i++)
				if (isPrime(i)) count++;
			
			sb.append(count).append("\n");
		} 
		System.out.print(sb.toString());	
	}
}