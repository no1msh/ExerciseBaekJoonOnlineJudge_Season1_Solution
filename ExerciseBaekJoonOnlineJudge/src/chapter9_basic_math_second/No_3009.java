package chapter9_basic_math_second;

import java.io.*;

public class No_3009 
{
	// �� ���� �־����� �� , �࿡ ������ ���簢���� ����� ���ؼ� �ʿ��� �� ��° ���� ã�� ���α׷��� �ۼ��Ͻÿ�.
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] inputA = br.readLine().split(" ");
		String[] inputB = br.readLine().split(" ");
		String[] inputC = br.readLine().split(" ");
		
		int resultX = 0;
		int resultY = 0;
		
		// X��ǥ �Ǻ�
		if (inputA[0].equals(inputB[0]))
			resultX = Integer.parseInt(inputC[0]);
		else if (inputB[0].equals(inputC[0]))
			resultX = Integer.parseInt(inputA[0]);
		else
			resultX = Integer.parseInt(inputB[0]);
		
		// Y��ǥ �Ǻ�
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