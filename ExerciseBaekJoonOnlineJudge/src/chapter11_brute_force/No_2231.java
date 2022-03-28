package chapter11_brute_force;

import java.io.*;

public class No_2231 {

	static int digitGenerator(int inputNum ) {
		
		int sum;
		int n = inputNum;
		
		for (int i = 1; i< inputNum; i++) {
			
			sum = i;
			int temp = i;
			
			while ( temp != 0)
			{
				sum += temp % 10;
				temp /= 10;
			}
			
			if (sum == n ) 
				return i;
			
		}
		return 0;
	}

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		int n = Integer.parseInt(br.readLine());
		System.out.println(digitGenerator(n));
		
	}
}