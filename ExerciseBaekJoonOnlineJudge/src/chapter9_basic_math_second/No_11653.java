package chapter9_basic_math_second;

import java.io.*;

public class No_11653 {
//	���� N�� �־����� ��, ���μ������ϴ� ���α׷��� �ۼ��Ͻÿ�.
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

		if (n != 1) // n�� ���� �ݺ����� �ɸ��� �ʰ�, 1�� �ƴ϶�� n�� ���� ���ش� ex) 2,3 ���
			sb.append(n);
		System.out.print(sb);
	}
}