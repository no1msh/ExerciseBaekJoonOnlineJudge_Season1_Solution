package chapter5_array;

import java.util.Scanner;

public class No_2562 
{
	// 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int max = 0;
		int maxIndex = 0;
		
		
		
		int[] array = new int[9];
				
		for ( int i = 0 ; i < 9; i++ )
		{
			int temp = in.nextInt();
			array[i] = temp;
			
			if (array[i] > max)
			{
				max = array[i];
				maxIndex = i;
			}
		}
		
		System.out.println(max);
		System.out.print(maxIndex+1);
	}

}
