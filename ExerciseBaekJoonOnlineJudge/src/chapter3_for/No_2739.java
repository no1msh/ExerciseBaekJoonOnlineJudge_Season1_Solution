package chapter3_for;

import java.util.Scanner;
public class No_2739 
{
	// N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for (int i = 1 ; i<10 ; i++)
		{
			System.out.printf("%d * %d = %d\n", n , i , n*i);
		}
	}

}