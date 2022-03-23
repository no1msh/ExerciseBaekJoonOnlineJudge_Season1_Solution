package chapter9_basic_math_second;

import java.io.*;

public class No_9020 {

	public static void main(String[] args) throws IOException {
		
		boolean[] notPrime = new boolean[10001]; // �⺻ ���� false�� ����. �� ���� �Ҽ��� �´ٷ� �ʱ�ȭ�� ����

		notPrime[0] = notPrime[1] = true; // 0�� 1�� �Ҽ��� �ƴϱ⿡ ���� �ɷ��ݴϴ�.

		for (int i = 2; i * i <= notPrime.length; i++) { // 2���� �츮�� �� ���Ϸ��� �ϴ� ������ ��Ʈ������ 
			
			if (notPrime[i]) continue; // notPrime[i] �� true��� i++�� ���� �ݺ� ���� 
			
			for (int j = i*i ; j < notPrime.length; j += i) { // ex) 2���� ���ʴ�� ����� ������ �Ҽ��� �ƴ϶�� �������ش�.
				notPrime[j] = true;
			}
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		
		int testCase = Integer.parseInt(br.readLine());
		int n;
		int p , q;
		
		while (testCase-- > 0)
		{
			n = Integer.parseInt(br.readLine());
			p = q = n/2;
				
			while(true)
			{
				if ( !notPrime[p] && !notPrime[q]){
					
					sb.append(p).append(" ").append(q).append("\n");
					break;
				}
				
				else{
					p--;
					q++;
				}
			}
			
		}
		
		System.out.print(sb.toString());
		
	}
}
