package chapter8_basic_math_first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_10250 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for (int i = 0 ; i < testCase ; i ++)
		{
			String[] tempArray = br.readLine().split(" ");
			
			int H = Integer.parseInt(tempArray[0]); // Ãþ
			int W = Integer.parseInt(tempArray[1]);	// ÇØ´ç Ãþ ¹æÀÇ ÃÑ¼ö
			int N = Integer.parseInt(tempArray[2]);	// ¸î¹øÂ° ¹æÀÎÁö

			int floor = 0;
			int ho = 0;
			
			if ( N % H == 0)
			{
				floor = H;
				ho = N/H;
			}
			else 
			{	
				floor = N % H;
				ho = N / H + 1;
			}
			
			System.out.printf("%d%02d\n", floor, ho);
		}
		br.close();
	}
}