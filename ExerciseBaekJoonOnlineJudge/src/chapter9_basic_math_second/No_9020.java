package chapter9_basic_math_second;

import java.io.*;

public class No_9020 {

	public static void main(String[] args) throws IOException {
		
		boolean[] notPrime = new boolean[10001]; // 기본 값은 false로 설정. 즉 전부 소수가 맞다로 초기화가 진행

		notPrime[0] = notPrime[1] = true; // 0과 1은 소수가 아니기에 먼저 걸러줍니다.

		for (int i = 2; i * i <= notPrime.length; i++) { // 2부터 우리가 총 구하려고 하는 범위의 루트까지만 
			
			if (notPrime[i]) continue; // notPrime[i] 가 true라면 i++로 다음 반복 진행 
			
			for (int j = i*i ; j < notPrime.length; j += i) { // ex) 2부터 차례대로 배수를 가져와 소수가 아니라고 지정해준다.
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
