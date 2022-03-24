package chapter10_recursive_function;

import java.io.*;

public class No_10870 {

	static int fibo (int inputNum) {
		
		int result;
		
		if ( inputNum == 1)
			return 1;
		else if (inputNum == 0)
			return 0;
		
		else
		{
			result = fibo(inputNum-2) + fibo(inputNum -1);
			return result;
		}
		
	}
	
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.print(fibo(n));
		
	}

}
