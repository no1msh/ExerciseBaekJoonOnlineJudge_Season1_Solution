package chapter1_input_and_output;

import java.util.Scanner;

public class No_2588 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		System.out.println(num1*(num2%10)); // num2�� 1���ڸ��� ����� num1�� ����.
		System.out.println(num1*(num2%100/10)); // num2�� 10�� �ڸ��� ����� num1�� ����.
		System.out.println(num1*(num2/100));	// num2�� 100���ڸ��� ����� num1�� ���� 
		System.out.print(num1*num2);
	}

}
