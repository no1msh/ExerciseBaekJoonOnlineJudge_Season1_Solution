package chapter3_for;

import java.util.Scanner;

public class No_11022 
{
	// �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
