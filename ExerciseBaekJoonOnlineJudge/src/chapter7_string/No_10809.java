package chapter7_string;

import java.util.Scanner;

public class No_10809 
{
	// 알파벳 소문자로만 이루어진 단어 S가 주어진다. 
	// 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		
		String abc = "abcdefghijklmnopqrstuvwxyz";
		
		for (int i = 0 ; i < abc.length() ; i++)
		{
			boolean include = false; 
			for (int j = 0 ; j < s.length() ; j++)
			{
				if ( abc.charAt(i) == s.charAt(j)) // char 비교는 '==' 연산자 사용이 가능합니다. 
				{
					include = true;
					System.out.print(j+" ");	
					break; // 처음 나온 수를 찾아 출력하고 내부 반복을 중지합니다.
				}
			}
			if (!include)
				System.out.print(-1+" ");
			
			
		}
		
	}

}
