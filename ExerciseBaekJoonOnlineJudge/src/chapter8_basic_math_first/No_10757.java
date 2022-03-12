package chapter8_basic_math_first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_10757 
{
//	두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] inputArray = new String[2];
		char[] resultArray;
		inputArray = br.readLine().split(" ");
		br.close();
		String a = inputArray[0];
		String b = inputArray[1];
		boolean isOverTen = false;
		
		char indexA;
		char indexB;
		
		if (a.length() > b.length())
			resultArray = new char[a.length()+1];
		
		else
			resultArray = new char[b.length()+1];

		for (int i = 0 ; i < resultArray.length  ; i++ )
		{
			if (a.length()-i-1 < 0)
				indexA = '0';
			else
				indexA = a.charAt(a.length()-i-1);

			
			if (b.length()-i-1 < 0)
				indexB = '0';
			else
				indexB = b.charAt(b.length()-i-1);
			
			int sum = (Character.getNumericValue(indexA)+Character.getNumericValue(indexB));
			
			// 합의 경우 10이 넘어가는 경우 체크
			if (isOverTen)
				sum += 1;
			
			isOverTen = false; // 다시 false로 초기화 해줍니다.
			
			if (sum >= 10)
				isOverTen = true;
			
			resultArray[resultArray.length-1-i] = (char)(sum%10+'0');
			
		}
		
		for (int j = 0 ; j < resultArray.length ; j ++)
		{
			if (j == 0 && resultArray[j] == '0' )
				continue;
			System.out.print(resultArray[j]);
		}
		
	}

}
