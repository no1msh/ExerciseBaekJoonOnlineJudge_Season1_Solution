package chapter7_string;

import java.util.ArrayList;
import java.util.Scanner;

public class No_1316 
{

	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int count = 0;
		for (int i = 0 ; i < n ; i++)
		{
			String inputStr = in.next();
			ArrayList charArrayList = new ArrayList();
			boolean isCorrect = true;
			
			for (int j = 0 ; j < inputStr.length() ; j++)
			{
				if ( j > 0 && inputStr.charAt(j-1) == inputStr.charAt(j)) // ���� char���̶� �̹� char ���̶� ���մϴ�.
					continue; // ���ٸ� ���� �ݺ����� �Ѿ�ϴ�.
				
				if (!charArrayList.contains(inputStr.charAt(j))) // charArrayList�� ���ҷ� �̹� char ���� ���ԵǾ� ���� �ʴٸ�
					charArrayList.add(inputStr.charAt(j)); // ���Խ�ŵ�ϴ�.
				
				else // ���� ������ �Ǿ��ִµ� ���� char ���̶��� �ٸ� char ���̶�� �׷�ܾ �ƴ϶�� �Ǵ��մϴ�.
					isCorrect = false;
				
			}
			if (isCorrect)
				count ++;
		}
		
		System.out.print(count);
		
	}

}
