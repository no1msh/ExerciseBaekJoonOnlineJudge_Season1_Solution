package chapter3_for;

import java.util.Scanner;

public class No_2439 
{
	// ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
	// ������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for (int i = 0 ; i < n ; i++)
		{
			for ( int space = 1 ; space < n-i ; space++)
				System.out.print(" ");
			
			for ( int j = 0 ; j <= i ; j++)
				System.out.print("*");
			
			System.out.println();
		}
	}
}
