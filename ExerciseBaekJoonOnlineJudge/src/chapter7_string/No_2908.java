package chapter7_string;

import java.util.Scanner;

public class No_2908 
{
	// ���ڸ��� ���� A�� B�� �־����� �̸� �ݴ�� ������ ���� ���Ͽ� ���� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	static String strReverse (String str) 
	{
		char[] reversedStr = new char[str.length()]; 
		
		for (int i = 0; i < str.length(); i++)
		{
			reversedStr[i] = str.charAt(str.length()-1-i); // ���ڷ� ���� str�� �������� �����ؼ� ���� �־��ݴϴ�.
		}
		
		String resultStr = new String(reversedStr); // String�� �������� ���ڷ� reversedStr�� �־� char[]�� String���� ��ȯ.
		
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
