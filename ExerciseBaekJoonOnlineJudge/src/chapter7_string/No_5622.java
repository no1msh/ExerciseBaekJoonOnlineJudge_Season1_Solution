package chapter7_string;

import java.util.Scanner;

public class No_5622 
{
	/*
	 * 숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선
	 * 1초씩 더 걸린다.
	 * 
	 * 상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를
	 * 들어, UNUCIC는 868242와 같다.
	 * 
	 * 할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.
	 */
	
	static int spendedTime (int inputNumber)
	{
		int resultTime = inputNumber + 1;
		
		return resultTime;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String[] dial = {"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		String inputStr = in.nextLine();
		int result = 0;
		
		for (int i = 0; i<inputStr.length(); i++)
		{
			for (int j = 0; j < dial.length; j++)
			{
				if (dial[j].contains(inputStr.substring(i,i+1))) // str.contains(포함되는지 알아볼 String 값) 맞으면 true를 return
					result += spendedTime(j);
			}
			
		}
		
		System.out.print(result);
		
	}
}
