package chapter5_array;

import java.util.Scanner;

public class No_2562 
{
	// 9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
