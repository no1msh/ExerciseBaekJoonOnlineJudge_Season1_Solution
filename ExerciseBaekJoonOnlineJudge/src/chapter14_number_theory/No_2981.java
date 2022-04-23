package chapter14_number_theory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
 
public class No_2981 {		
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
 
		Arrays.sort(arr);	// ����
 
		int gcdVal = arr[1] - arr[0];	// ������ ���� �ʵ��� ū ������ ���� ���� ���ش�.
 
		for(int i = 2; i < N; i++) {
			// ������ �ִ� ������� ���� ��(arr[i] - arr[i - 1])�� �ִ������� ���� 
			gcdVal = gcd(gcdVal, arr[i] - arr[i - 1]);
		}
 
		StringBuilder sb = new StringBuilder();
		
		// �ִ������� ����� ã�� (���ݱ����� Ž��)
		for(int i = 2; i <= gcdVal / 2; i++) {
	    
			// i�� ���� ���� �ִ������� ������?
			if(gcdVal % i == 0) {
				sb.append(i + " ");
			}
		}
		
		// ������ �ִ����� �� ����ؾ���
		sb.append(gcdVal);
        
		System.out.println(sb);
		
	}
	
	// �ִ����� �Լ�
	static int gcd(int a, int b) {
		while(b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
 
}