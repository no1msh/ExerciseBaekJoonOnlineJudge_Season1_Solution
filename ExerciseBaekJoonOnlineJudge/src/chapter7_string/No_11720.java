package chapter7_string;

import java.util.Scanner;

public class No_11720 
{
	// N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		long sum=0;
		
		int n = in.nextInt();
		String str = in.next();
		
		for (int i = 0; i < str.length(); i++)
			sum += Character.getNumericValue(str.charAt(i)); // Character.getNumericValue(char) �޼ҵ带 ���� char���� int������ ���Ϲ޴´�.

		System.out.println(sum);
	}

}