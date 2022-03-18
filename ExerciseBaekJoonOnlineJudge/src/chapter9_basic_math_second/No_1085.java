package chapter9_basic_math_second;

import java.io.*;

public class No_1085 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputArr = br.readLine().split(" ");
		
		int x = Integer.parseInt(inputArr[0]);
		int y = Integer.parseInt(inputArr[1]);
		int w = Integer.parseInt(inputArr[2]);
		int h = Integer.parseInt(inputArr[3]);
		
		// �ᱹ �����̳� ���� �������θ� �ּڰ��� ���´�.
		// 0�� ����� ���ΰ� w,h�� �������ΰ�?
		
		int horizontalTemp = 0;
		int verticalTemp = 0;
		
		if (x > w-x) // x�� w�� ����ﶧ
			horizontalTemp = w-x;
		else
			horizontalTemp = x;
		
		if (y > h-y) // y�� h�� ����� ��
			verticalTemp = h - y;
		else
			verticalTemp = y;
		
		if (horizontalTemp > verticalTemp)
			System.out.print(verticalTemp);
		else
			System.out.print(horizontalTemp);
	}

}
