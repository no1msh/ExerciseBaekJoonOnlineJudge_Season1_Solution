package chapter3_for;

import java.util.Scanner;

public class No_10871 
{
	// ���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
