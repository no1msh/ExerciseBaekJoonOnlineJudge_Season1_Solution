package chapter2_If;

import java.util.Scanner;
public class No_14681 
{
	/*
	 * 점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오.
		단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
	 */
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		if (x > 0)
		{
			if (y > 0)
				System.out.print(1);
			else
				System.out.print(4);
		}
		else	
		{
			if (y > 0)
				System.out.print(2);
			else
				System.out.print(3);
		}
		
	}
	
}
