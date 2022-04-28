package chapter14_number_theory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;
 
public class No_9375 {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
 
		int T = Integer.parseInt(br.readLine());	// �׽�Ʈ ���̽� 
 
		while (T -- > 0) {
			
			HashMap<String, Integer> hm = new HashMap<>();	// <����, ����>
			
			int N = Integer.parseInt(br.readLine());	// �Է¹޴� ���� ����
			
			while (N-- > 0) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				
				st.nextToken();	// �� �̸��� �ʿ� ���� 
				
				String kind = st.nextToken();	// �� ���� 
 
				/**
				 * �ش� ������ ���� �ؽøʿ� �������
				 * �ؽøʿ� ����Ǿ��ִ� �ش� ������ ������ +1 ������Ų��.
				 *
				 * �ش� ������ ���� �ؽøʿ� ���� ���
				 * �ش� ������ ���� 1�� �ִ´�.
				 */
				
				if (hm.containsKey(kind)) {
					hm.put(kind, hm.get(kind) + 1);
				} 
				else {
					hm.put(kind, 1);
				}
			}
 
			int result = 1;
 
			/**
			 * �� �Դ� ��츦 ����Ͽ� �� ������ ���� ������ +1 ���� ����
			 * �����־�� �Ѵ�.
			 */
			for (int val : hm.values()) {
				result *= (val + 1);
			}
			// �˸��� ���¸� �������־�� �ϹǷ� �������� -1�� ����.
			sb.append(result - 1).append('\n');
 
		}
		System.out.println(sb);
	}
 
}