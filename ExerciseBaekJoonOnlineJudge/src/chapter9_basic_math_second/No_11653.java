package chapter9_basic_math_second;

import java.io.*;

public class No_11653 {
//	정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		for (int i = 2; i * i <= n; i++) {
			
			while (n % i == 0) {
				n /= i;
				sb.append(i).append('\n');
			}
			
		}

		if (n != 1) // n이 만약 반복문에 걸리지 않고, 1이 아니라면 n도 포함 해준다 ex) 2,3 등등
			sb.append(n);
		System.out.print(sb);
	}
}