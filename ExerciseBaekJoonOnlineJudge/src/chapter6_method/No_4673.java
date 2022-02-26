package chapter6_method;

import java.util.Arrays;

// 10000���� �۰ų� ���� ���� �ѹ��� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ������ ���λ����� �ʹ� ��� ��ũ�� ��ü �մϴ�.
// https://www.acmicpc.net/problem/4673

public class No_4673 
{

	static int specialAdd(int n) // ������ ���� ���ڸ����� ��� ���ϴ� �޼ҵ�
	{
		// ������ ������ ����� ������ ������ ������ �� �ڸ��� ���ϴ� ��� �Դϴ�.

		// ��) 23456�� õ�� �ڸ��� �����ϴ� ��� �ش� ���� �ϴ� 1000���� ������ 23�� ���ɴϴ�. ���⼭ ���ϴ°� 3�̱� ������
		// �ѹ��� 10���� ������ ������ ���ָ� 23%10 == 3 �̰� �˴ϴ�.
		n = n + (n / 10000 % 10) + (n / 1000 % 10) + (n / 100 % 10) + (n / 10 % 10) + (n % 10);

		return n;
	}

	public static void main(String[] args) 
	{
		// ���� : Array�� Ȱ�� ArrayList X
		int[] specialAddNumbers = new int[10000]; // 1~10000���� �޼ҵ带 ����� ����� ������ �迭
		int[] resultNumbers = new int[10000]; // ������ ������ �迭

		for (int i = 0; i < specialAddNumbers.length; i++) // specialAddNumbers�� for���� ���� ���� �������� �̴ϴ�.
		{
			if (specialAdd(i + 1) < 10000) // �׸��� ��� ���� 10000���� ������
				specialAddNumbers[i] = specialAdd(i + 1); // index 0���� specialAdd(1)�� �������� ���������� �� ����

		}

		Arrays.sort(specialAddNumbers); // specialAddNumbers�迭�� ������������ ����, �̷����� ���� �޸𸮿� �ڵ������� ���� 0�� ���Ե˴ϴ�.

		int indexNum = 0; // ������ ���� �迭 index �ڸ��� j�� �״�� ��� �ϸ� ������ ���Ұ� ��ġ�� �迭�� �ȴ�. ���� ���� �ʿ�.

		for (int j = 0; j < specialAddNumbers.length; j++) // 0�� �������� �ʰ� ���丸 ���߸��� �ݺ�
		{
			if (specialAddNumbers[j] == 0) // �迭�� ���Ҹ� �������� �� 0�̶�� ���� �ݺ����� �Ѿ�ϴ�.
				continue;

			specialAddNumbers[indexNum] = specialAddNumbers[j]; // 0�� �ƴ϶�� indexNum�� ������� ���� �ϳ��� �ִ´�.
			indexNum++;
		}

		int resultIndex = 0;

		for (int x = 1; x < resultNumbers.length; x++) // 1���� �����ѹ��� �迭�� ������ �̴ϴ�.
		{
			boolean overlap = false; // �޼ҵ带 ���� �迭�� ���Ұ� �ߺ��ϴ��� üũ���� boolean type �����Դϴ�.

			for (int value : specialAddNumbers) // for-each ������ x�� ���� �����ְ� ���ٸ� �ߺ�üũ ���� overlap�� true�� �������ݴϴ�.
			{
				if (x == value)
					overlap = true;

			}

			if (!overlap) // �ߺ��� �ƴϸ� �´� ���̱⿡
			{
				resultNumbers[resultIndex] = x; // resultIndex ������ 0���� �������� x���� �������ݴϴ�.
				resultIndex++;
			}
		}

		for (int value : resultNumbers) // �������θ� ������ �迭�� �ϳ��� ������ִµ� 0�� ���� ����մϴ�.
		{
			if (value != 0)
				System.out.println(value);
		}

	}

}
