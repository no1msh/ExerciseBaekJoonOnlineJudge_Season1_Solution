package chapter8_basic_math_first;

import java.util.Scanner;

public class No_1712 
{	
	// A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램을 작성하시오.
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		int A = in.nextInt(); // 고정 지출 비용
		int B = in.nextInt(); // 노트북 제작 지출 비용
		int C = in.nextInt(); // 노트북 판매 비용

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