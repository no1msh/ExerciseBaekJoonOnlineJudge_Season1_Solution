package chapter7_string;

import java.util.Scanner;

public class No_1152 
{
	// ���� ��ҹ��ڿ� �������� �̷���� ���ڿ��� �־�����. �� ���ڿ����� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	// ��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		String inputStr = in.nextLine(); // next()�� ��������� ���ڿ��� �ް� , nextLine()�� ������������ ����Ǳ���� ���ڿ��� �޽��ϴ�.
		
		String[] dividedStr = inputStr.split(" "); // ������ �������� ���ڿ��� ���� �ݴϴ�.
		
		int spaceCount = 0;
		for (String value : dividedStr)
		{
			if ( value.equals("")) // ����ڰ� ������ �հ� ���� ������ ����ϰ� �Ǹ� �� ������ �������� �յڰ� ������ ������ ""���� ���� �˴ϴ�.
				spaceCount++; // ""�� üũ�ؼ� ī��Ʈ�� �÷��ݴϴ�.
		}
		
		System.out.print(dividedStr.length-spaceCount); // �ش� �迭�� ���̿� ""���� ���� ����ϸ� ���� ��� ��.
	}

}
