package chapter5_array;

import java.util.Scanner;

public class No_10818_ver2 
{
	// N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. (Array.sort() �޼ҵ� ��� ���ϰ� ����)
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int max = 0 ;
		int min = 1000001;
		int[] array = new int[n];
		
		for (int i = 0 ; i < n ; i++)	// �迭�� ���Ҹ� ������ ���ÿ� �ִ� �ּҸ� ���ϴ� �ݺ�. 
		{
			int temp = in.nextInt();
			array[i] = temp;
			
			if ( temp > max)
				max = temp;
			
			if (temp < min)
				min = temp;
			
		}
		
		System.out.print(min + " " + max);
		
		
	}

}
