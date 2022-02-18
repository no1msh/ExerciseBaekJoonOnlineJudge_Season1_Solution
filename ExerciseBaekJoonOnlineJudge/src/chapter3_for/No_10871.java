package chapter3_for;

import java.util.Scanner;

public class No_10871 
{
	// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int x = in.nextInt();
		
		for( int i = 0 ; i < a ; i++)
		{
			int n = in.nextInt();
			
			if ( n < x )
			{
				System.out.print(n+" ");
			}
		}
	}
}
