package chapter9_basic_math_second;

import java.io.*;

public class No_4948_super_fast 
{
	/*
	 * n < 123456 이므로 2n 은 최대 246912 이다. 0 부터 시작하므로 246912 + 1
	 */
	public static boolean[] prime = new boolean[246913];

	/*
	 * 1 부터 누적하여 각 index 까지의 소수의 개수를 담을 배열
	 */
	public static int[] count_arr = new int[246913];

	// 소수를 얻는 메소드
	public static void get_prime() 
	{
		// 0 과 1 은 소수가 아니므로 true
		prime[0] = prime[1] = true;

		// 2부터 시작하여 
		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i])
				continue;
			for (int j = i * i; j < prime.length; j += i) { // i의 제곱을 시작으로 i씩 추가
				prime[j] = true;
			}
		}
	}

	// 소수의 개수를 얻는 메소드
	public static void get_count() 
	{
		int count = 0;
		for (int i = 2; i < prime.length; i++) 
		{
			if (!prime[i])
				count++; // 소수일 경우 count를 증가시킨다

			/*
			 * 0 ~ i 까지 소수의 개수 = count count 값을 count_arr 의 i 에 저장한다
			 */
			count_arr[i] = count;
		}
	}

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		get_prime(); // 소수를 얻는 메소드 실행
		get_count(); // 소수의 개수가 저장된 배열을 얻는 메소드 실행
		
		StringBuilder sb = new StringBuilder();

		while (true) 
		{
			int n = Integer.parseInt(br.readLine());
			if (n == 0)
				break; // n 이 0 일경우 종료

			// 2n 까지의 소수의 개수 - n 까지의 소수의 개수
			sb.append(count_arr[2 * n] - count_arr[n]).append('\n');
		}
		System.out.print(sb);
	}

}
