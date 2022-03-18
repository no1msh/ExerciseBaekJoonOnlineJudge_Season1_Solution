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
		
		// 결국 수평이나 수직 방향으로만 최솟값이 나온다.
		// 0과 가까울 것인가 w,h와 가까울것인가?
		
		int horizontalTemp = 0;
		int verticalTemp = 0;
		
		if (x > w-x) // x가 w에 가까울때
			horizontalTemp = w-x;
		else
			horizontalTemp = x;
		
		if (y > h-y) // y가 h에 가까울 때
			verticalTemp = h - y;
		else
			verticalTemp = y;
		
		if (horizontalTemp > verticalTemp)
			System.out.print(verticalTemp);
		else
			System.out.print(horizontalTemp);
	}

}
