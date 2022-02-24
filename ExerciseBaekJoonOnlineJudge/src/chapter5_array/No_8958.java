package chapter5_array;

import java.util.Scanner;

public class No_8958 
{

	/*
	 * "OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. ������ ���� ��� �� ������
	 * ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.
	 * 
	 * "OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
	 * 
	 * OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(); // ��� �׽�Ʈ ���̽��� ���� ���� ������ ����ϴ�.
		
		for( int i = 0; i < n ; i ++)
		{
			int score = 0;
			int currentScoreStack = 1;
			String ox = in.next();
			
			
			for ( int j = 0 ; j < ox.length(); j++)
			{
				if(ox.charAt(j) == 'O')
				{
					score += currentScoreStack;
					currentScoreStack ++;
					
				}
				else
					currentScoreStack = 1;
									
			}
			
			System.out.println(score);
			
		}
	}

}
