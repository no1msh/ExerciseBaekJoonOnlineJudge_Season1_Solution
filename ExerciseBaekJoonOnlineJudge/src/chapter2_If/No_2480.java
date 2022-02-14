package chapter2_If;

import java.util.Scanner;
public class No_2480
{
	/*
	 * 1�������� 6������ ���� ���� 3���� �ֻ����� ������ ������ ���� ��Ģ�� ���� ����� �޴� ������ �ִ�.
	 * 
	 * ���� ���� 3���� ������ 10,000��+(���� ��)��1,000���� ����� �ް� �ȴ�. 
	 * ���� ���� 2���� ������ ��쿡�� 1,000��+(������)��100���� ����� �ް� �ȴ�.
	 * ��� �ٸ� ���� ������ ��쿡�� (�� �� ���� ū ��)��100���� ����� �ް� �ȴ�. 
	 * ���� ���,
	 * 3���� �� 3, 3, 6�� �־����� ����� 1,000+3��100���� ���Ǿ� 1,300���� �ް� �ȴ�. �� 3���� ���� 2, 2, 2��
	 * �־����� 10,000+2��1,000 ���� ���Ǿ� 12,000���� �ް� �ȴ�. 3���� ���� 6, 2, 5�� �־����� ���� ���� ū ����
	 * 6�̹Ƿ� 6��100���� ���Ǿ� 600���� ������� �ް� �ȴ�.
	 * 
	 * 3�� �ֻ����� ���� ���� �־��� ��, ����� ����ϴ� ���α׷��� �ۼ� �Ͻÿ�.
	 */
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int price;
		int dice1 = in.nextInt();
		int dice2 = in.nextInt();
		int dice3 = in.nextInt();
		
		if ((dice1 == dice2) && dice2 == dice3)
			price = 10000 + dice1 * 1000;
		else if (dice1 == dice2 || dice2 == dice3 || dice1 == dice3)
		{
			if(dice1 == dice2)
				price = 1000 + dice1 * 100;
			else if(dice2 == dice3)
				price = 1000 + dice2 * 100;
			else
				price = 1000 + dice1 * 100;
		}
		else
		{
			if (dice1 > dice2)
			{	if (dice1 > dice3)
					price = dice1 * 100;
				else
					price = dice3 * 100;
			}
			else
			{
				if (dice2 > dice3)
					price = dice2 * 100;
				else
					price = dice3 * 100;
			}
		}
		System.out.print(price);
	}
}