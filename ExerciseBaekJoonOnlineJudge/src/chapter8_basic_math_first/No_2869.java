package chapter8_basic_math_first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2869 
{

	public static void main(String[] args) throws IOException 
	{
		// Scanner in = new Scanner(System.in);	Scanner�� ����ϸ� �ƹ��� �ڵ尡 �����ص� �ð� �ʰ��� ��ϴ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int[] arrays = new int[3];
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i< arrays.length ; i++)
		{
			arrays[i] = Integer.parseInt(st.nextToken());
		}
		
		int A = arrays[0];
		int B = arrays[1];
		int V = arrays[2];
		int day = 0;

		// ������ ������ �׷��ٰ� �ؼ� ȿ������ �ڵ��� �ƴ�. ( �ð��ʰ� ) ��Ģ���� ã�� ����ȭ ���� ������ ����� �غ���.
//		while(true)
//		{
//			distance += A;
//			times ++;
//			if (distance >= V)
//				break;
//			distance -= B;
//			
//		} 

		// �����̴� ������ ���� �������ϱ� ������ ������ ���� V - B
		// B��� �㿡 �̲������� �Ÿ��� �ᱹ �߰��� �����̰� �ö󰡾��� �Ÿ��� �˴ϴ�.
		// �׷��� ���������� B�� ���ִ� ���� ���Ǵ� ������ �ذ��ؾ� �մϴ�.
		// A-B �� ������ ���ذ��ٰ� ���� ���� �� ���������� A�� ������ �մϴ�. �ֳ� A�� �� ������ �����̰� �� �ִ� �Ÿ��ϱ��.
		// (A-B) * day �� �ϸ� day * A - day * B + B >= V
		// ���⼭ +B �� �������� ������ �Ǵ� B�� �ٽ� ������ ���.
		// ���� �̻��� �ʱ� ������ ������ ���ָ�
		// day * A - day * B >= V - B
		// A-B �� �Ϸ��Ϸ� ���ٰ� V�� �ѱ� �� ���� �Ϸ縸 �� ���ָ� ��
		// ���� 0���� �� ������ ���ٸ�? �״�� ������ݴϴ�. �츮�� ������ ���� �� B�� ���ҵǴ� ������ �̸� �����Ͽ����ϴ�.
		
		day = (V - B) / (A - B);

		if ((V - B) % (A - B) == 0) // �� �������� >> �״�� ��� �������� A��ŭ �߰��� ���� V���� �����ϰ� �Ǵ� ���
			System.out.print(day);
		else {
			System.out.print(day + 1); // �� ������ �������� ���� ��� >> ���� �Ÿ��� ���ұ⿡ ������ �ѹ��� �����ָ� �ȴ�. 
		}

	}

}