package chapter9_basic_math_second;

import java.io.*;

public class No_4948_fast {
	final static int MAX = 123456 * 2 + 1;

	static boolean[] isPrime = new boolean[MAX];

	static boolean[] setPrime() {

		isPrime[0] = isPrime[1] = isPrime[4] = false;
		isPrime[2] = isPrime[3] = true;
		
		first:
		for (int i = 5; i < MAX; i++) {

			for (int j = 2; j*j <= i ; j++) {

				if (i % j == 0) {
					isPrime[i] = false;
					continue first;
				}
				isPrime[i] = true;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		setPrime();
		int n;
		int count;

		while (true) {
			n = Integer.parseInt(br.readLine());

			if (n == 0)
				break;

			count = 0;

			for (int i = n + 1; i <= 2 * n; i++) {
				if (isPrime[i])
					count++;
			}

			sb.append(count).append("\n");
		}
		System.out.print(sb.toString());
	}
}