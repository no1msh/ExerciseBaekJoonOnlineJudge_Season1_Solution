package chapter1_InputAndOutput;

import java.util.Scanner;

public class No_10430 
{
	/*
	 * (A+B)%C�� ((A%C) + (B%C))%C �� ������?
	 * 
	 * (A��B)%C�� ((A%C) �� (B%C))%C �� ������?
	 * 
	 * �� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
	}

}
