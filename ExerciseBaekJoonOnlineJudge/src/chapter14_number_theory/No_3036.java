package chapter14_number_theory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class No_3036 {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int N = Integer.parseInt(br.readLine());
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		// ù ��° ��
		int firstRing = Integer.parseInt(st.nextToken());
 
		for (int i = 1; i < N; i++) {
			
			int otherRing = Integer.parseInt(st.nextToken());
			
			// ���м��� ����� ���� �ִ����� ã��
			int gcd = gcd(firstRing, otherRing);
 
			// �и�� ���ڸ� �ִ������� �����ֱ� 
			System.out.println((firstRing / gcd) + "/" + (otherRing / gcd));
		}
 
	}
 
	// �ִ����� �޼ҵ�
	static int gcd(int a, int b) {
		int r;
 
		while (b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
 
}