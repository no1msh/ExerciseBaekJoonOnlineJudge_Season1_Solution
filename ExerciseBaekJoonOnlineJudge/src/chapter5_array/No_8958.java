package chapter5_array;

import java.util.Scanner;

public class No_8958 
{

	/*
	 * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의
	 * 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
	 * 
	 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
	 * 
	 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
	 */
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(); // 몇개를 테스트 케이스로 받을 건지 개수를 물어봅니다.
		
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
