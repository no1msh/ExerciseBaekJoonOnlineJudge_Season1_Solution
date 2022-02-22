package chapter5_array;

import java.util.Scanner;
import java.util.Arrays;
public class No_10818 
{
	// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		
		int n = in.nextInt();
		int[] array = new int[n]; 
		
		for (int i = 0 ; i < n ; i++)
		{
			int temp = in.nextInt();
			array[i] = temp;
		}
		
		Arrays.sort(array); // sort 메소드는 오름 차순으로 정렬이다. 대신 sort 메소드를 사용하면 메모리와 시간적인 문제에서 불리하다. 
		
		System.out.print(array[0] + " "+ array[array.length-1]);
	}

}
