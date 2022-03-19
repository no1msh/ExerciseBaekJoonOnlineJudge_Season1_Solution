package chapter9_basic_math_second;

import java.io.*;

public class No_3009 
{
	// 세 점이 주어졌을 때 , 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] inputA = br.readLine().split(" ");
		String[] inputB = br.readLine().split(" ");
		String[] inputC = br.readLine().split(" ");
		
		int resultX = 0;
		int resultY = 0;
		
		// X좌표 판별
		if (inputA[0].equals(inputB[0]))
			resultX = Integer.parseInt(inputC[0]);
		else if (inputB[0].equals(inputC[0]))
			resultX = Integer.parseInt(inputA[0]);
		else
			resultX = Integer.parseInt(inputB[0]);
		
		// Y좌표 판별
		if (inputA[1].equals(inputB[1]))
			resultY = Integer.parseInt(inputC[1]);
		else if (inputB[1].equals(inputC[1]))
			resultY = Integer.parseInt(inputA[1]);
		else
			resultY = Integer.parseInt(inputB[1]);
		
		sb.append(resultX).append(" ").append(resultY);
		
		System.out.print(sb.toString());
		
	}
}