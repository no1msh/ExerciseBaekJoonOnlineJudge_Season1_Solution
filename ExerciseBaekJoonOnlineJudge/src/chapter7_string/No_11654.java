package chapter7_string;

import java.util.Scanner;

public class No_11654 
{
	// 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		char input = in.nextLine().charAt(0); // charAt(index) 인덱스 자리에 있는 char 값 리턴
		
		System.out.print((int)input);
	}

}
