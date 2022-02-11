package chapter2_If;

import java.util.Scanner;
public class No_1330
{
	//	두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
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
