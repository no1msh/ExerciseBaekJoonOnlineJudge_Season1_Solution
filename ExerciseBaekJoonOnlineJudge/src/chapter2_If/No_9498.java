package chapter2_If;

import java.util.Scanner;
public class No_9498 
{
	// ���� ������ �Է¹޾�
	// 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int grade = in.nextInt();
		
		if ( grade >= 90)
			System.out.print("A");
		else if (grade >= 80)
			System.out.print("B");
		else if (grade >= 70)
			System.out.print("C");
		else if (grade >= 60)
			System.out.print("D");
		else
			System.out.print("F");
	}

}
