package chapter7_string;

import java.util.Scanner;

public class No_10809 
{
	// ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. 
	// ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
				if ( abc.charAt(i) == s.charAt(j)) // char �񱳴� '==' ������ ����� �����մϴ�. 
				{
					include = true;
					System.out.print(j+" ");	
					break; // ó�� ���� ���� ã�� ����ϰ� ���� �ݺ��� �����մϴ�.
				}
			}
			if (!include)
				System.out.print(-1+" ");
			
			
		}
		
	}

}
