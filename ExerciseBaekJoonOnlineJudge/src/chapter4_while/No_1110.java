package chapter4_while;

import java.util.Scanner;

public class No_1110 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		int temp = -1;	// �ʱ� ������ �Է��� ���� ���� ���ϰ� ������ ���Ѵ�.
		int count = 0;	// ����� �ݺ� �ɶ����� 1�� �߰� �ȴ�.
		int a = in.nextInt();
		int b = a;

		while (temp != b) // ���� ���� ������ ���� ������ �� ���� ����ȴ�.
		{
			temp = a % 10 * 10 + ((a / 10 + a % 10) % 10);	// ����
			count++;	// ����� �ѹ� �Ϸ� �� �� ���� ī��Ʈ�� 1�߰�

			if (temp == b) // ���� ���� ���� ���� �Է� ���� ���� ���ٸ�
			{
				System.out.print(count);	// ��� ����Ŭ�� ���Ҵ��� ���
				break;		// �ݺ� ����
			}
			a = temp;	// �ݺ��� ���� ���� �ʾ��� �� ���� ����� ���� a�� ���� ���� ����ְ�
			temp = -1;	// ��갪�� �� ����� temp�� �ٽ� �ʱ�ȭ�� �Ѵ�.

		}
	}
}
