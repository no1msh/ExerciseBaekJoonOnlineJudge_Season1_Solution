package chapter7_string;

import java.util.Scanner;

public class No_5622 
{
	/*
	 * ���� 1�� �ɷ��� �� 2�ʰ� �ʿ��ϴ�. 1���� ū ���� �Ŵµ� �ɸ��� �ð��� �̺��� �� �ɸ���, �� ĭ ���� �ִ� ���ڸ� �ɱ� ���ؼ�
	 * 1�ʾ� �� �ɸ���.
	 * 
	 * ������� �ҸӴϴ� ��ȭ ��ȣ�� �� ���ڿ� �ش��ϴ� ���ڷ� �ܿ��. ��, � �ܾ �� ��, �� ���ĺ��� �ش��ϴ� ���ڸ� �ɸ� �ȴ�. ����
	 * ���, UNUCIC�� 868242�� ����.
	 * 
	 * �ҸӴϰ� �ܿ� �ܾ �־����� ��, �� ��ȭ�� �ɱ� ���ؼ� �ʿ��� �ּ� �ð��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
				if (dial[j].contains(inputStr.substring(i,i+1))) // str.contains(���ԵǴ��� �˾ƺ� String ��) ������ true�� return
					result += spendedTime(j);
			}
			
		}
		
		System.out.print(result);
		
	}
}
