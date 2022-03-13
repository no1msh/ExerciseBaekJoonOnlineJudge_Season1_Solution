package chapter9_basic_math_second;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1978 {
	// �־��� �� N�� �߿��� �Ҽ��� �� ������ ã�Ƽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

	public static boolean isPrime(int checkNum) {
		if (checkNum == 1)
			return false;

		for (int i = 2; i <= checkNum / 2; i++) {
			if (checkNum % i == 0)
				return false;
		}
		return true;

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String[] inputArray = new String[n];
		inputArray = br.readLine().split(" ");

		int count = 0;

		for (int i = 0; i < n; i++) {
			if (isPrime(Integer.parseInt(inputArray[i])))
				count++;
		}

		System.out.print(count);
	}

}