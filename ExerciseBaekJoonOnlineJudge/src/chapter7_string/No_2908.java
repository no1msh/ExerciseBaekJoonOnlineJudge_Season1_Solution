package chapter7_string;

import java.util.Scanner;

public class No_2908 
{
	// 세자리의 숫자 A와 B가 주어지면 이를 반대로 뒤집고 서로 비교하여 높은 것을 출력하는 프로그램을 작성하시오.
	
	static String strReverse (String str) 
	{
		char[] reversedStr = new char[str.length()]; 
		
		for (int i = 0; i < str.length(); i++)
		{
			reversedStr[i] = str.charAt(str.length()-1-i); // 인자로 들어온 str은 역순으로 추출해서 값을 넣어줍니다.
		}
		
		String resultStr = new String(reversedStr); // String의 생성자의 인자로 reversedStr을 넣어 char[]을 String으로 변환.
		
		return resultStr;
		
	}
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		String a = in.next();
		String b = in.next();
		
		int intA;
		int intB;
		
		a = strReverse(a);
		b = strReverse(b);
		
		intA = Integer.parseInt(a);
		intB = Integer.parseInt(b);
		
		if ( intA > intB )
			System.out.print(intA);
		else
			System.out.print(intB);	
	}

}
