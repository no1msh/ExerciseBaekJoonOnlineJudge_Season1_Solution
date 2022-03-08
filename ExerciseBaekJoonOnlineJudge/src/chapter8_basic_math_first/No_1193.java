package chapter8_basic_math_first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1193 {

	
//	�̿� ���� ������ �м����� 1/1 �� 1/2 �� 2/1 �� 3/1 �� 2/2 �� �� �� ���� ������� ������ 
//	���ʴ�� 1��, 2��, 3��, 4��, 5��, �� �м���� ����. X�� �־����� ��, X��° �м��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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

		int th = inputNum - temp; // i �ܰ迡�� ��°�� ���ؾ���
		int x , y;	// x�� ���� , y�� �и�
		
		if (i % 2 == 1) // Ȧ���� ���
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

		} else {	// ¦���� ���
			
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