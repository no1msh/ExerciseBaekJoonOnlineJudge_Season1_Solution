package chapter10_recursive_function;

import java.io.*;

public class No_2447 {
	static char[][] arr;

	static void printStar(int x, int y, int n, boolean isBlank) {
		if (isBlank) // 빈칸일 경우
		{
			for (int i = x; i < x + n; i++) {
				for (int j = y; j < y + n; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}

		if (n == 1) // 가장 작은크기의 셀일 경우
		{
			arr[x][y] = '*';
			return;
		}

		// 빈칸도 가장 작은 칸도 아닐 경우 
		
		int cellSize = n / 3; // 총 9개중 하나의 칸이 될 크기
		int count = 0;

		for (int i = x; i < x + n; i += cellSize) {
			
			for (int j = y; j < y + n; j += cellSize) {
				
				count++;
				if (count == 5) { // 9개중 중간 칸이 공백칸이다.
					printStar(i, j, cellSize, true); // 재귀호출
					
				} else {
					printStar(i, j, cellSize, false); // 재귀호출
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		int n = Integer.parseInt(br.readLine());
		arr = new char[n][n]; // 정답이 되는 2차원 배열
		
		printStar(0,0,n,false); // 첫시작은 입력받은 n값으로 (0,0)의 자리부터 시작된다.
		
		for (int i = 0; i < n; i++) // 좌상단 부터 시작
		{
			for (int j = 0; j < n ; j++)
			{
				sb.append(arr[i][j]);
			}
			sb.append("\n"); // 한 행이 끝나면 줄바꿈
		}
		
		System.out.print(sb);

	}

}
