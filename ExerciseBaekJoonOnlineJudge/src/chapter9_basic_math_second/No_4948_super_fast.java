package chapter9_basic_math_second;

import java.io.*;

public class No_4948_super_fast 
{
	/*
	 * n < 123456 �̹Ƿ� 2n �� �ִ� 246912 �̴�. 0 ���� �����ϹǷ� 246912 + 1
	 */
	public static boolean[] prime = new boolean[246913];

	/*
	 * 1 ���� �����Ͽ� �� index ������ �Ҽ��� ������ ���� �迭
	 */
	public static int[] count_arr = new int[246913];

	// �Ҽ��� ��� �޼ҵ�
	public static void get_prime() 
	{
		// 0 �� 1 �� �Ҽ��� �ƴϹǷ� true
		prime[0] = prime[1] = true;

		// 2���� �����Ͽ� 
		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i])
				continue;
			for (int j = i * i; j < prime.length; j += i) { // i�� ������ �������� i�� �߰�
				prime[j] = true;
			}
		}
	}

	// �Ҽ��� ������ ��� �޼ҵ�
	public static void get_count() 
	{
		int count = 0;
		for (int i = 2; i < prime.length; i++) 
		{
			if (!prime[i])
				count++; // �Ҽ��� ��� count�� ������Ų��

			/*
			 * 0 ~ i ���� �Ҽ��� ���� = count count ���� count_arr �� i �� �����Ѵ�
			 */
			count_arr[i] = count;
		}
	}

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		get_prime(); // �Ҽ��� ��� �޼ҵ� ����
		get_count(); // �Ҽ��� ������ ����� �迭�� ��� �޼ҵ� ����
		
		StringBuilder sb = new StringBuilder();

		while (true) 
		{
			int n = Integer.parseInt(br.readLine());
			if (n == 0)
				break; // n �� 0 �ϰ�� ����

			// 2n ������ �Ҽ��� ���� - n ������ �Ҽ��� ����
			sb.append(count_arr[2 * n] - count_arr[n]).append('\n');
		}
		System.out.print(sb);
	}

}
