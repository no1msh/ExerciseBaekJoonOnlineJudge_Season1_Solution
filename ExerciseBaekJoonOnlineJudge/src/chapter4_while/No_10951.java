package chapter4_while;

import java.util.Scanner;

public class No_10951 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		while (in.hasNext())	// hasNext() �޼ҵ带 ���� EOF�� ����� �� �ִ�.
		{
			int a = in.nextInt();
			int b = in.nextInt();
			
			int sum = a+b;
			
			System.out.println(sum);
			
		}
	}
}