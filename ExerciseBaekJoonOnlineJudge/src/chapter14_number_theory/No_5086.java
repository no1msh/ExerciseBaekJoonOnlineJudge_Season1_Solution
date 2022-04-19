package chapter14_number_theory;

import java.io.*;

public class No_5086 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = 0;
		int num2 = 0;
		
		while (true) {
			String[] inputStr = br.readLine().split(" ");
			num1 = Integer.parseInt(inputStr[0]);
			num2 = Integer.parseInt(inputStr[1]);
			
			if (num1 == num2 && num1 == 0)
				break;
			
			if (num2 % num1 == 0)
				System.out.println("factor");
			else if(num1 % num2 == 0)
				System.out.println("multiple");
			else
				System.out.println("neither");
		}

	}

}