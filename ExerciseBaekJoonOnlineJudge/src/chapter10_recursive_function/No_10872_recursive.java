package chapter10_recursive_function;

import java.io.*;
public class No_10872_recursive {

	static int factorial ( int inputNum) {
		
		if ( inputNum == 0)
			return 1;
		
		int result = 1;
		
		if ( inputNum != 1)
			result = inputNum * factorial(inputNum -1);
		return result;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = factorial(Integer.parseInt(br.readLine()));
		System.out.print(result);
	}

}
