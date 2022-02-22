package chapter5_array;

import java.util.Scanner;

public class No_10818_ver2 
{
	// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오. (Array.sort() 메소드 사용 안하고 구현)
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int max = 0 ;
		int min = 1000001;
		int[] array = new int[n];
		
		for (int i = 0 ; i < n ; i++)	// 배열에 원소를 넣음과 동시에 최대 최소를 비교하는 반복. 
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
