package chapter3_for;

import java.util.Scanner;
public class No_8393 
{
	// n�� �־����� �� , 1���� n���� ���� ���ϴ� ���α׷��� ���Ͻÿ�.
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int sum = 0;
		
		for (int i = 1 ; i <= n ; i++)
			sum += i;
		
		System.out.print(sum);
	}

}