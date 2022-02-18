package chapter3_for;

import java.util.Scanner;

public class No_11022 
{
	// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for ( int i = 1 ; i <= n ; i++)
		{
			int a = in.nextInt();
			int b = in.nextInt();
			
			System.out.printf("Case #%d: %d + %d = %d\n", i , a , b , a+b);
		}
	}

}
