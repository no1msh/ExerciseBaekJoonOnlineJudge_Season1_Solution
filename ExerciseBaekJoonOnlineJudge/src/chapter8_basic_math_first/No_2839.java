package chapter8_basic_math_first;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No_2839 {
	// ����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	// ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int bong5 = 0;
		int bong3 = 0;

		if (n == 4 || n == 7)
			bw.write(Integer.toString(-1));

		else {
			
			switch (n % 5) {
			
			case 0:
				bong5 = n / 5;
				break;
			case 1:
				bong5 = n / 5 - 1;
				bong3 = (n % 5 + 5) / 3;
				break;
			case 2:
				bong5 = n / 5 - 2;
				bong3 = (n % 5 + 10) / 3;
				break;
			case 3:
				bong5 = n / 5;
				bong3 = 1;
				break;
			case 4:
				if (n < 5) {
					bong5 = 0;
					bong3 = 0;
				}
				bong5 = (n / 5) - 1;
				bong3 = (n % 5 + 5) / 3;
				break;
			}
			bw.write(Integer.toString(bong5 + bong3));

		}
		bw.flush();
		bw.close();
	}
}