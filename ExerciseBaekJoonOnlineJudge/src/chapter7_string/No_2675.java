package chapter7_string;

import java.util.Scanner;

public class No_2675
{
	// 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt(); // 테스트 케이스를 몇번 받을 건지 입력받습니다.
		
		for (int a = 0 ; a < t ; a++)
		{
			int n = in.nextInt(); // 각 글자를 몇번씩 반복할건지 입력받습니다.
			String s = in.next(); // 각 글자를 반복할 문장을 입력받습니다.
			
			for (int i = 0 ; i < s.length(); i++) // 문장의 길이 만큼 반복할거고
			{
				for(int j = 0; j < n ; j++) // n만큼 반복해서 출력할겁니다 ex) s="ABC" ,  n==3 -> AAABBBCCC
				{
					System.out.print(s.charAt(i)); // String에서 index가 i인 문자 하나를 가져와서 출력합니다.
				}
				
			}
			System.out.println(); // 출력했으면 각 케이스마다 개행을 해줍니다.
		}

	}

}
