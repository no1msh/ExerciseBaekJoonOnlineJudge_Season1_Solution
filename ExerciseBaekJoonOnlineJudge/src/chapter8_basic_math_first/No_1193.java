package chapter8_basic_math_first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1193 {

	
//	이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 
//	차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자. X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputNum = Integer.parseInt(br.readLine());

		int i = 1;
		int j = 0;
		int xCount = 0;
		int yCount = 0;
		int temp = 0;
		
		while (true) {
			
			j += i;
			
			if (j >= inputNum)
				break;
			
			i++;
		}

		for (int k = 1; k < i; k++)
			temp += k;

		int th = inputNum - temp; // i 단계에서 번째로 구해야함
		int x , y;	// x는 분자 , y는 분모
		
		if (i % 2 == 1) // 홀수일 경우
		{

			for ( x = i; x > 0; x--) {
				xCount ++;
				if (xCount == th)
					break;

			}
			
			for ( y = 1; y <= i; y++) {
				yCount ++;
				if (yCount == th)
					break;
			}

		} else {	// 짝수일 경우
			
			for ( x = 1; x <= i; x++) {
				xCount ++;
				if (xCount == th)
					break;
			}
			
			for ( y = i; y > 0; y--) {
				yCount ++;
				if (yCount == th)
					break;

			}
		}
		System.out.print(x+"/"+y);
	}
}