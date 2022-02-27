package chapter6_method;

import java.util.Scanner;

public class No_1065 {
	 // � ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. 
	//���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�.
	// N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

	static boolean isHansu(int n) // boolean Ÿ������ �Ѽ��� üũ���ִ� �޼ҵ��Դϴ�. 
	{
		int a = 0;
		int b = 0;
		int c = 0;
		
		if (n < 100)
			return true;
		
		else 
		{
			a = n / 100;
			b = n / 10 % 10;
			c = n % 10;
			
			if (a-b == b-c)
				return true;
		}
		return false; // �⺻ ���� �� 
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int count = 0; // �Ѽ��� ������ ����
		
		// ������ 1���� �����ؼ� 1000���� �̳� 1000�� �̹� �Ѽ��� �ƴմϴ�. �׷��Ƿ� �����ϰ� ���ڸ����� �ִ�θ� ���ô�.
		// ���� 1���� 99 ������ �񱳴���� ���ʿ� �ΰ� ���϶� ������ �Ѽ��Դϴ�.
		// ������ ���ڸ� ���� �����ε� �̶����� �ڸ� ���� ������ ���� ���غ���� �սô�.
		
		for (int i = 1 ; i <= n ; i++)	// 1���� �����Ͽ� �Է��� �������� �Ѽ��� üũ �ؼ� 
		{
			if (isHansu(i)) // �Ѽ��� �´ٸ�
				count++;	// ī��Ʈ�� �ϳ��� �÷� �ݽô�.
				
		}
		
		System.out.print(count);	// �ݺ��� ������ count�� ������ݴϴ�. 

	}

}
