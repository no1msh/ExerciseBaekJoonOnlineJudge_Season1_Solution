package chapter3_for;

import java.util.Scanner;
public class No_10950 
{
	// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
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