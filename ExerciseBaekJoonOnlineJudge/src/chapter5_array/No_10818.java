package chapter5_array;

import java.util.Scanner;
import java.util.Arrays;
public class No_10818 
{
	// N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
		
		Arrays.sort(array); // sort �޼ҵ�� ���� �������� �����̴�. ��� sort �޼ҵ带 ����ϸ� �޸𸮿� �ð����� �������� �Ҹ��ϴ�. 
		
		System.out.print(array[0] + " "+ array[array.length-1]);
	}

}
