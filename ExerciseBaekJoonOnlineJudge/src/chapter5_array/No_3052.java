package chapter5_array;

import java.util.Scanner;

public class No_3052 
{
	// �� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. ���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
	// �� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int[] numbers = new int[10] ; // �Է¹��� ������ �������� �迭�Դϴ�. 
		int[] remain = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }; // ������ ���� ������ �迭�Դϴ�. �������� 0�� �� �ֱ⿡ -1�� �ʱ�ȭ�� ���ݴϴ�. 
		int count = 0 ; // ���� �ٸ� �������� �� �� �ִ��� ������ �����Դϴ�.
		boolean overlap = false;	// ������ ������ �ߺ��ϴ��� üũ���� boolean Ÿ�� ���� �Դϴ�.
		
		for (int i = 0 ; i < numbers.length; i++)
		{
			numbers[i] = in.nextInt();
			
			for ( int value : remain)	// remain �迭�� ����ִ� ���Ҹ� �ϳ��� �����ͼ� value�� �־��ݴϴ�. 
			{
				
				if ( numbers[i] % 42 == value) // remain �迭�� ������ �츮�� ����� �������� ���� �Ȱ��� �ִٸ� �ݺ��� �����մϴ�.
					{
						overlap = true;
						break;
					}
		
			}
			
			if (!overlap)
			{
				remain[i] = numbers[i] % 42;	// �ߺ��Ǵ� ���� ���ٸ� 42�� ���� ���� �ٷ� remain �迭�� ���ҷ� �߰����ݴϴ�.
				count ++; // ���� �� �� ���� �����ݴϴ�. ( ���� ���� >> ���� ������ ���� �Ȱ�ġ�� ���� �ϳ� �����. count 1����
			}
			
			overlap = false; // �ѹ����� ���� �ٽ� �ߺ��� ����� ������ �ʱ�ȭ ���ݴϴ�.
		}
		System.out.print(count);
	}
}