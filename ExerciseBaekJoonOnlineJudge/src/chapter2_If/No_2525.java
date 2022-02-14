package chapter2_If;

import java.util.Scanner;
public class No_2525 
{
	/*
	 * KOI ���ڿ����� �ǰ��� ���� ���ִ� ������������ �丮�� �����ϰ� ����� �ΰ����� ������ �����Ϸ��� �Ѵ�. �ΰ����� ������ ����ϴ� �����
	 * ������ ���� ���� ���� ��Ḧ �ΰ����� ���쿡 ������ �ȴ�. �׷��� �ΰ����� ������ ���챸�̰� ������ �ð��� �� ������ �ڵ�������
	 * ����Ѵ�.
	 * 
	 * ����, KOI ������ �ΰ����� ���� �ո鿡�� ����ڿ��� ������������ �丮�� ������ �ð��� �˷� �ִ� ������ �ð谡 �ִ�.
	 * 
	 * �����������̸� �����ϴ� �ð��� ���챸�̸� �ϴ� �� �ʿ��� �ð��� �д����� �־����� ��, ���챸�̰� ������ �ð��� ����ϴ� ���α׷���
	 * �ۼ��Ͻÿ�.
	 */
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int hour = in.nextInt();
		int minute = in.nextInt();
		int cookingTime = in.nextInt();
		
		int tempHour;
		
		if ( (minute+cookingTime) < 60)
		{	
			minute += cookingTime;
			System.out.print(hour + " " + minute);
		}
		else
		{
			hour += (minute + cookingTime) / 60;
			
			if( hour >= 24)
				hour %= 24;
			minute = (minute + cookingTime) % 60;
			System.out.print(hour + " " + minute);
		}
		
	}

}
