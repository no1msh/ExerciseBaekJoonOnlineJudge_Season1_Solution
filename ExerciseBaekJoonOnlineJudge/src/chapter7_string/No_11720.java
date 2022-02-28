package chapter7_string;

import java.util.Scanner;

public class No_11720 
{
	// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		long sum=0;
		
		int n = in.nextInt();
		String str = in.next();
		
		for (int i = 0; i < str.length(); i++)
			sum += Character.getNumericValue(str.charAt(i)); // Character.getNumericValue(char) 메소드를 통해 char값을 int형으로 리턴받는다.

		System.out.println(sum);
	}

}