package chapter13_backtracking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class No_9663 {
 
	public static int[] arr;
	public static int N;
	public static int count = 0;
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
 
		nQueen(0);
		System.out.println(count);
 
	}
 
	public static void nQueen(int depth) {
		// ��� ���Ҹ� �� ä�� ���¸� count ���� �� return 
		if (depth == N) {
			count++;
			return;
		}
 
		for (int i = 0; i < N; i++) {
			arr[depth] = i;
			// ���� �� �ִ� ��ġ�� ��� ���ȣ��
			if (Possibility(depth)) {
				nQueen(depth + 1);
			}
		}
 
	}
 
	public static boolean Possibility(int col) {
 
		for (int i = 0; i < col; i++) {
			// �ش� ���� ��� i���� ���� ��ġ�Ұ�� (���� �࿡ ������ ���) 
			if (arr[col] == arr[i]) {
				return false;
			} 
			
			/*
			 * �밢���� �����ִ� ���
			 * (���� ���� ���� ���� ���� ��찡 �밢���� �����ִ� ����)
			 */
			else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
				return false;
			}
		}
		
		return true;
	}
}