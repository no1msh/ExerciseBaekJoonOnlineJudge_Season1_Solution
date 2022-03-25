package chapter10_recursive_function;

import java.io.*;

public class No_2447 {
	static char[][] arr;

	static void printStar(int x, int y, int n, boolean isBlank) {
		if (isBlank) // ��ĭ�� ���
		{
			for (int i = x; i < x + n; i++) {
				for (int j = y; j < y + n; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}

		if (n == 1) // ���� ����ũ���� ���� ���
		{
			arr[x][y] = '*';
			return;
		}

		// ��ĭ�� ���� ���� ĭ�� �ƴ� ��� 
		
		int cellSize = n / 3; // �� 9���� �ϳ��� ĭ�� �� ũ��
		int count = 0;

		for (int i = x; i < x + n; i += cellSize) {
			
			for (int j = y; j < y + n; j += cellSize) {
				
				count++;
				if (count == 5) { // 9���� �߰� ĭ�� ����ĭ�̴�.
					printStar(i, j, cellSize, true); // ���ȣ��
					
				} else {
					printStar(i, j, cellSize, false); // ���ȣ��
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		int n = Integer.parseInt(br.readLine());
		arr = new char[n][n]; // ������ �Ǵ� 2���� �迭
		
		printStar(0,0,n,false); // ù������ �Է¹��� n������ (0,0)�� �ڸ����� ���۵ȴ�.
		
		for (int i = 0; i < n; i++) // �»�� ���� ����
		{
			for (int j = 0; j < n ; j++)
			{
				sb.append(arr[i][j]);
			}
			sb.append("\n"); // �� ���� ������ �ٹٲ�
		}
		
		System.out.print(sb);

	}

}
