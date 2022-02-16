package chapter3_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class No_15552 
{
	// ù �ٿ� �׽�Ʈ���̽��� ���� T�� �־�����. T�� �ִ� 1,000,000�̴�. 
	// ���� T�ٿ��� ���� �� ���� A�� B�� �־�����. A�� B�� 1 �̻�, 1,000 �����̴�.
	// �� �׽�Ʈ���̽����� A+B�� �� �ٿ� �ϳ��� ������� ����Ѵ�.
	// Java�� ����ϰ� �ִٸ�, Scanner�� System.out.println ��� BufferedReader�� BufferedWriter�� ���
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));	// ����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // ����
		
		String n = bf.readLine(); // ��� �ݺ� �Ұ��� �Է� �޽��ϴ�.
		int times = Integer.parseInt(n);
		
		for (int i = 0; i < times ; i++)
		{
			String s = bf.readLine(); // String
			
			String array[] = s.split(" "); //���鸶�� ������ ��� �迭�� ����
			
			int a = Integer.parseInt(array[0]); //ù��° ȣ��
			int b = Integer.parseInt(array[1]); //�ι�° ȣ��

			int sum = a+b;
			
			
			bw.write(sum+"\n");	// ���ۿ� �ִ� �� ���� ���
		}
		
		bw.flush();	// �����ִ� �����͸� �����½�Ŵ
		bw.close();	// ��Ʈ���� �ݽ��ϴ�.
	}

}