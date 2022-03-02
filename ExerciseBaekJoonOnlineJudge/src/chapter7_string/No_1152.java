package chapter7_string;

import java.util.Scanner;

public class No_1152 
{
	// 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
	// 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		String inputStr = in.nextLine(); // next()는 공백까지만 문자열을 받고 , nextLine()은 다음라인으로 개행되기까지 문자열을 받습니다.
		
		String[] dividedStr = inputStr.split(" "); // 공백을 기준으로 문자열을 나눠 줍니다.
		
		int spaceCount = 0;
		for (String value : dividedStr)
		{
			if ( value.equals("")) // 사용자가 문장의 앞과 끝에 공백을 출력하게 되면 그 공백을 기준으로 앞뒤가 나뉘기 때문에 ""값이 들어가게 됩니다.
				spaceCount++; // ""을 체크해서 카운트를 올려줍니다.
		}
		
		System.out.print(dividedStr.length-spaceCount); // 해당 배열의 길이에 ""값을 빼고 출력하면 정답 출력 끝.
	}

}
