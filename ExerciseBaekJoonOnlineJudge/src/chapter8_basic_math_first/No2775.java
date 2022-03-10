package chapter8_basic_math_first;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2775 
{
	// �� ����Ʈ�� ���ָ� �Ϸ��� ������ �ִµ�
	// 'a���� bȣ�� ����� �ڽ��� �Ʒ� ��(a-1)�� 1ȣ���� bȣ���� ������� ���� �ո�ŭ ������� ������ ��ƾ� �Ѵ�.'
	// �־����� k�� n�� ���� k���� nȣ�� ����� ��� �ִ��� ����϶�
	// ����Ʈ�� 0������ �ְ� 1ȣ���� �����ϸ�, 0���� iȣ���� i���� ���.

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int testCase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testCase; i++) 
		{
			int k = Integer.parseInt(br.readLine()); // ��
			int n = Integer.parseInt(br.readLine()); // ȣ

			// �ᱹ ����� ���� �����ϴ°� �Ʒ����� ������� �� k-1���� nȣ������ ������� ��
			// ex 1���� 3ȣ ���� �� 0���� 1�� , 2�� , 3�� �� 6�� ���� 1���� 3ȣ�� 6�� ���.
			// ex 2���� 3ȣ�� 1���� 1ȣ 2ȣ 3ȣ�� ��� �� >> 1���� 1ȣ 2ȣ 3ȣ�� �� >> 1+ 3 +6 >> 10

			int[][] apartment = new int[k+1][15];

			for (int a = 0; a <= k; a++) 
			{
				for (int b = 1; b < 15; b++) // 1ȣ ~ 14ȣ(max)
				{
					if (a == 0) // 0�� �� �� bȣ�� �״�� b���� ��ϴ�.
					{
						apartment[a][b] = b;
					}
					
					else // 0���� �ƴ� �� a-1���� bȣ������ ������� ���� ���Ե˴ϴ�. 
					{
					for (int z = 1; z <= b ; z++)
						apartment[a][b] += apartment[a-1][z];
					}
					
				}
			}
			bw.write(Integer.toString(apartment[k][n])+"\n");
			
		}
		br.close();
		bw.flush();
		bw.close();
	}
}