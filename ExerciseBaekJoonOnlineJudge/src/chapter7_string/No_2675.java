package chapter7_string;

import java.util.Scanner;

public class No_2675
{
	// ���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt(); // �׽�Ʈ ���̽��� ��� ���� ���� �Է¹޽��ϴ�.
		
		for (int a = 0 ; a < t ; a++)
		{
			int n = in.nextInt(); // �� ���ڸ� ����� �ݺ��Ұ��� �Է¹޽��ϴ�.
			String s = in.next(); // �� ���ڸ� �ݺ��� ������ �Է¹޽��ϴ�.
			
			for (int i = 0 ; i < s.length(); i++) // ������ ���� ��ŭ �ݺ��ҰŰ�
			{
				for(int j = 0; j < n ; j++) // n��ŭ �ݺ��ؼ� ����Ұ̴ϴ� ex) s="ABC" ,  n==3 -> AAABBBCCC
				{
					System.out.print(s.charAt(i)); // String���� index�� i�� ���� �ϳ��� �����ͼ� ����մϴ�.
				}
				
			}
			System.out.println(); // ��������� �� ���̽����� ������ ���ݴϴ�.
		}

	}

}
