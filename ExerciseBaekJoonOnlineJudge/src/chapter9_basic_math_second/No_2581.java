package chapter9_basic_math_second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_2581 {
//	자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.

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