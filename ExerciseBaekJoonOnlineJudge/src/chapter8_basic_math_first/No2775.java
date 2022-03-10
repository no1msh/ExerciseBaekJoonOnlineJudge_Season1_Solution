package chapter8_basic_math_first;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2775 
{
	// 이 아파트에 거주를 하려면 조건이 있는데
	// 'a층의 b호에 사려면 자신의 아래 층(a-1)의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다.'
	// 주어지는 k와 n에 대해 k층에 n호는 몇명이 살고 있는지 출력하라
	// 아파트는 0층부터 있고 1호부터 시작하며, 0층의 i호에는 i명이 산다.

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCase; i++) 
		{
			int k = Integer.parseInt(br.readLine()); // 층
			int n = Integer.parseInt(br.readLine()); // 호

			// 결국 몇명이 살지 결정하는건 아래층의 사람들의 수 k-1층의 n호까지의 사람들의 수
			// ex 1층의 3호 까지 는 0층의 1명 , 2명 , 3명 총 6명 따라서 1층의 3호는 6명 산다.
			// ex 2층의 3호는 1층의 1호 2호 3호의 명수 합 >> 1층의 1호 2호 3호의 합 >> 1+ 3 +6 >> 10

			int[][] apartment = new int[k+1][15];

			for (int a = 0; a <= k; a++) 
			{
				for (int b = 1; b < 15; b++) // 1호 ~ 14호(max)
				{
					if (a == 0) // 0층 일 땐 b호는 그대로 b명이 삽니다.
					{
						apartment[a][b] = b;
					}
					
					else // 0층이 아닐 땐 a-1층의 b호까지의 사람들의 합이 들어가게됩니다. 
					{
					for (int z = 1; z <= b ; z++)
						apartment[a][b] += apartment[a-1][z];
					}
					
				}
			}
			bw.write(Integer.toString(apartment[k][n])+"\n");
			
		}
		br.close();
		bw.flush();
		bw.close();
	}
}