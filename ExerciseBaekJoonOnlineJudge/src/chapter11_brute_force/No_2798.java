package chapter11_brute_force;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class No_2798 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st= new StringTokenizer(br.readLine());
		
		ArrayList<Integer> inputArr = new ArrayList<Integer>();
		
		
		
		for (int i = 0 ; i < n ; i ++) {
			int temp = Integer.parseInt(st.nextToken());
			
			if (temp < m) inputArr.add(temp); // ���� 3���� ���� ���� m���� �۰� ���ߴ°ű� ������ m�� �Ѵ� ���� �̸� �����ݴϴ�.
		}
		
		inputArr.sort(Comparator.reverseOrder()); // ���� �������� ���� ���ݴϴ�.
		
		
		
		int sum = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		forA:
		for (int a = 0; a < inputArr.size() ; a++ ) {
			
			num1 = inputArr.get(a);
			
			forB:
			for (int b =0 ; b < inputArr.size(); b++) {
				
				if ( a == b) continue forB; // a�� ���� ī��� ���� �ϰ� b�� �̽��ϴ�.
				
				num2 = inputArr.get(b);
				
				if ( num1 + num2 > m) continue forB;
				
				forC:
				for (int c = 0; c < inputArr.size() ; c++) {
					if ( a == c || b == c) continue forC; // a�� b�� ���� ī��� �����ϰ� c�� �̽��ϴ�.
					
					num3 = inputArr.get(c);
					
					if (num1 + num2 + num3 > m) continue forC;
					
					else if (num1 + num2 + num3 == m) {
						
						sum = num1 + num2 + num3 ;
						
						break forA;
					}
					
					else if ( m - (num1 + num2 + num3) < m - sum)
						sum = num1 + num2 + num3;
					
				}
			}
		}
		System.out.print(sum);
	}
}