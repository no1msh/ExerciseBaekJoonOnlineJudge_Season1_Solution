package chapter5_array;

import java.util.Scanner;

public class No_1546 
{
	/*
	 * �����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ����
	 * M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
	 * 
	 * ���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
	 * 
	 * �������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		double max = 0.0;
		double sum = 0.0;
		double result = 0.0;
		
		double[] grade = new double[n];
		double[] riggedGrade = new double[n];
		
		for (int i = 0 ; i < grade.length; i++)
		{
			grade[i] = in.nextDouble();
			
			if ( grade[i] > max )
				max = grade[i];
		}
		
		for ( int j = 0 ; j < grade.length ; j++)
			riggedGrade[j] = grade[j]/max * 100;
		
		for ( double value : riggedGrade)
			sum += value;

		result = sum / n;
		
		System.out.print(result);
	}

}
