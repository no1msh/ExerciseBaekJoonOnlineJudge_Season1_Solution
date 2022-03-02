package chapter7_string;

import java.util.Scanner;

public class No_1157 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		// abcCount �迭�� �� ���ĺ��� �ԷµǼ� ���� String���� ���ĺ��� ���Ͽ� �ߺ��Ǹ� �ش��ϴ� ������ ���� �÷��� ��� ���Դ����� �˰��մϴ�.
		int[] abcCount = new int[abc.length()]; // �ʱ�ȭ �� �⺻ ������ 0�� ���ϴ�.
		
		
		String inputStr = in.next();
		
		inputStr =inputStr.toUpperCase(); // ��ҹ��ڴ� ���� ���� ������ �빮�ڷ� ���� ���ݴϴ�.
		
		for (int i = 0; i < abc.length(); i++) // ���� String ���� ���� ������ abc�� i��° �ε��� ���� �ø� ex) A�� ������ A�ڸ��� abcCount�� �ø�
		{
			for (int j = 0; j < inputStr.length(); j++)
			{
				if ( abc.charAt(i) == inputStr.charAt(j)) // ���� �˻����� ���ĺ��� ���� String�� ���ĺ� �ϳ��� ���Ͽ� �ߺ��Ǹ� 
					abcCount[i]++; // ���� �ø��ϴ�.
					
			}
		}
		
		int max = 0;
		int maxIndex = 0;
		for (int z = 0; z < abcCount.length; z++) // ���ݺ��� abcCount �迭�� ���� �߿� ���� ū ���� ã�Ƴ��� Index���� ã�Ƴ��ϴ�.
		{
			if(abcCount[z] > max) // max ���� ���� ���� ũ�ٸ� 
			{
				max = abcCount[z]; // max�� �ش��ϴ� ������ �����ؼ� �����մϴ�.
				maxIndex = z; // ���� �� ���� �ε��� ���� �������ݴϴ�.
			}
		}
		
		
		int countOverlap = 0; // �ִ밪�� �ߺ����� üũ���� �����Դϴ�.
		for (int z = 0 ; z < abcCount.length; z++) // �ִ밪�� �ߺ������� üũ���ִ� �ݺ��Դϴ�.
		{
			if (max == abcCount[z]) // max �� abcCount�� ���Ұ� ���� �� 
				countOverlap++; // �ߺ� Ƚ���� üũ�մϴ�.
		}
		
		if (countOverlap > 1) // �ι��̻� üũ �Ǹ� 
			System.out.print("?"); // ?�� ����մϴ�.
		else
			System.out.println(abc.charAt(maxIndex)); // �װ� �ƴ϶�� ���� ���� �ݺ��� ���ĺ��� ������ݴϴ�.

	}

}
