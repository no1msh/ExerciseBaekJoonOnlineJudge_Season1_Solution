package chapter8_basic_math_first;

import java.util.Scanner;

public class No_1712 
{	
	// A, B, C�� �־����� ��, ���ͺб����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		int A = in.nextInt(); // ���� ���� ���
		int B = in.nextInt(); // ��Ʈ�� ���� ���� ���
		int C = in.nextInt(); // ��Ʈ�� �Ǹ� ���

		long count = 0;
		long pay = 0;
		long income = 0;

		if (C - B <= 0) {
			System.out.print(-1);
			return;
		}

		else {
			pay = A;
			income = (C - B);
			count = pay / income;

			System.out.print(count+1);
		}
	}
}