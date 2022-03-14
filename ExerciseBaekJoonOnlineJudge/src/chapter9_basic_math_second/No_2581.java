package chapter9_basic_math_second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_2581 {
//	�ڿ��� M�� N�� �־��� �� M�̻� N������ �ڿ��� �� �Ҽ��� ���� ��� ��� �̵� �Ҽ��� �հ� �ּڰ��� ã�� ���α׷��� �ۼ��Ͻÿ�.

	static boolean isPrime(int inputNum) {
		if (inputNum == 1)
			return false;

		for (int i = 2; i <= inputNum / 2; i++) {
			if (inputNum % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());

		int sum = 0;
		int min = 0;
		boolean existPrimeNum = false;

		for (int i = m; i <= n; i++) {
			if (isPrime(i)) {
				if (min == 0)
					min = i;

				sum += i;
				existPrimeNum = true;
			}
		}

		if (existPrimeNum)
			System.out.print(sum + "\n" + min);
		else
			System.out.print(-1);

	}

}