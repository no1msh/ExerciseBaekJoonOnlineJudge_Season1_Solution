package chapter2_If;

import java.util.Scanner;
public class No_1330
{
	//	�� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		
		if (A > B)
		{
			System.out.print(">");
		}
		else if (A < B)
		{
			System.out.print("<");
		}
		else
			System.out.print("==");
	}

}
