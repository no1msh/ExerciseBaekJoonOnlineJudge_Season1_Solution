package chapter5_array;

import java.util.Scanner;
public class No_2577 
{
	// �� ���� �ڿ��� A, B, C�� �־��� �� A �� B �� C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	// ���� ��� A = 150, B = 266, C = 427 �̶�� A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�,
	// ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		/*	�̷� ������ε� �� ���� �ְ�����, �ʹ� ��ȿ������ �ʱ�ȭ ����Դϴ�. 
		 * ������ 0���� �����ؼ� 9�� �����ϴ�. 
		 * 0 ~ n , �� �ͼ����� �ʳ���?
		 * �ٷ� �迭�� �ε����Դϴ�. 
		 
		int zero = 0;
		int one = 0;
		int two= 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		*/
		
		int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0 ,0}; // �� �迭�� �ε����� �ϳ��� ���ڸ� ���մϴ� ex) array[0] �� 0 , array[5] �� 5�� ����.
		
		int a = in.nextInt();	// ���� 3�� �Է� �޽��ϴ�. ( 3�ڸ� �� )
		int b = in.nextInt();
		int c = in.nextInt();
		
		int result = a * b * c; // �� 3���� ���� ���� result ������ ����
		
		int count = 1;	// ���ݺ��� result�� �ڸ� ���� ��� count �Դϴ�. 10���� ������ ���鼭 �� ���̱� ������ �ϳ��� ���ڶ� �̸� 1�� �ʱ�ȭ �߽��ϴ�.
		while( result > 10) // 10���� �۾����� ���� 10���� �����̴ϴ�.
		{
			result /= 10;	// result�� 10�� ���� ���� �����ϸ� 
			count++;	// �׶����� count�� �ϳ� �� �ø��ϴ�.
		}
		
		result = a * b * c;	// result ���� �ٽ� ���� ��� �����ϴ�.
		
		for( int i = 0 ; i < count ; i++) // ī��Ʈ�� ���� ��ŭ �ݺ��� ������ 
		{
			array[result % 10]++; // ex) 1���ڸ��� ���� 0�̶�� array�� 0��°�� ���� ���� ��ŵ�ϴ�.
			result /= 10;	// result�� 10���� ���� ���� �ٽ� �����մϴ�. �׷��� ���� �ݺ� �� ���� �ڸ� ���� ��� �� �� �ֽ��ϴ�.
		}
		
		for (int value : array)	// for - each ������ ���� �迭�� ���Ҹ� �ϳ��� ����� ���� ����մϴ�. cf) value�ڸ��� �ʱ�ȭ�� �ʿ���� �տ� type�� �ʿ��մϴ�.
			System.out.println(value);
		
	}

}
