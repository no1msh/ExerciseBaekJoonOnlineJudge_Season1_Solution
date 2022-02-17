package chapter3_for;

import java.util.Scanner;

public class No_2742 
{
	// 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for (int i = n ; 1 <= i ; i--)
			System.out.println(i);
	}
}