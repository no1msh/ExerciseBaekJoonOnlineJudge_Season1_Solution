package chapter3_for;

import java.util.Scanner;
public class No_10950 
{
	// �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int a,b;
		int count;
		
		count = in.nextInt();
		
		for (int i = 0 ; i < count ; i++)
		{
			a = in.nextInt();
			b = in.nextInt();
			System.out.println(a+b);
		}
		
	}

}