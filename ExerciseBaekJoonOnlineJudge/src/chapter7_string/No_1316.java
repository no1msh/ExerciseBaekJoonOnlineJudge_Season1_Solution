package chapter7_string;

import java.util.ArrayList;
import java.util.Scanner;

public class No_1316 
{

	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int count = 0;
		for (int i = 0 ; i < n ; i++)
		{
			String inputStr = in.next();
			ArrayList charArrayList = new ArrayList();
			boolean isCorrect = true;
			
			for (int j = 0 ; j < inputStr.length() ; j++)
			{
				if ( j > 0 && inputStr.charAt(j-1) == inputStr.charAt(j)) // 전의 char값이랑 이번 char 값이랑 비교합니다.
					continue; // 같다면 다음 반복으로 넘어갑니다.
				
				if (!charArrayList.contains(inputStr.charAt(j))) // charArrayList에 원소로 이번 char 값이 포함되어 있지 않다면
					charArrayList.add(inputStr.charAt(j)); // 포함시킵니다.
				
				else // 만약 포함이 되어있는데 전의 char 값이랑은 다른 char 값이라면 그룹단어가 아니라고 판단합니다.
					isCorrect = false;
				
			}
			if (isCorrect)
				count ++;
		}
		
		System.out.print(count);
		
	}

}
