package chapter6_method;

import java.util.Arrays;

// 10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
// 문제의 세부사항은 너무 길어 링크로 대체 합니다.
// https://www.acmicpc.net/problem/4673

public class No_4673 
{

	static int specialAdd(int n) // 원래의 수와 각자리수를 모두 더하는 메소드
	{
		// 정수의 나눗셈 연산과 나머지 연산을 응용한 각 자리수 구하는 방법 입니다.

		// 예) 23456의 천의 자리를 추출하는 경우 해당 수를 일단 1000으로 나누면 23이 나옵니다. 여기서 원하는건 3이기 때문에
		// 한번더 10으로 나머지 연산을 해주면 23%10 == 3 이게 됩니다.
		n = n + (n / 10000 % 10) + (n / 1000 % 10) + (n / 100 % 10) + (n / 10 % 10) + (n % 10);

		return n;
	}

	public static void main(String[] args) 
	{
		// 참고 : Array만 활용 ArrayList X
		int[] specialAddNumbers = new int[10000]; // 1~10000까지 메소드를 사용한 결과를 저장할 배열
		int[] resultNumbers = new int[10000]; // 정답을 저장할 배열

		for (int i = 0; i < specialAddNumbers.length; i++) // specialAddNumbers에 for문을 통해 값을 저장해줄 겁니다.
		{
			if (specialAdd(i + 1) < 10000) // 그리고 결과 값이 10000보다 작은수
				specialAddNumbers[i] = specialAdd(i + 1); // index 0부터 specialAdd(1)을 시작으로 순차적으로 값 저장

		}

		Arrays.sort(specialAddNumbers); // specialAddNumbers배열을 오름차순으로 정렬, 이로인해 남는 메모리에 자동적으로 들어가는 0이 포함됩니다.

		int indexNum = 0; // 앞으로 나올 배열 index 자리에 j를 그대로 사용 하면 띄엄띄엄 원소가 배치된 배열이 된다. 따로 관리 필요.

		for (int j = 0; j < specialAddNumbers.length; j++) // 0을 포함하지 않고 정답만 간추리는 반복
		{
			if (specialAddNumbers[j] == 0) // 배열의 원소를 꺼내왔을 때 0이라면 다음 반복으로 넘어갑니다.
				continue;

			specialAddNumbers[indexNum] = specialAddNumbers[j]; // 0이 아니라면 indexNum의 순서대로 값을 하나씩 넣는다.
			indexNum++;
		}

		int resultIndex = 0;

		for (int x = 1; x < resultNumbers.length; x++) // 1부터 셀프넘버를 배열에 저장할 겁니다.
		{
			boolean overlap = false; // 메소드를 돌린 배열과 원소가 중복하는지 체크해줄 boolean type 변수입니다.

			for (int value : specialAddNumbers) // for-each 문으로 x와 값을 비교해주고 같다면 중복체크 변수 overlap을 true로 저장해줍니다.
			{
				if (x == value)
					overlap = true;

			}

			if (!overlap) // 중복이 아니면 맞는 답이기에
			{
				resultNumbers[resultIndex] = x; // resultIndex 값으로 0부터 차근차근 x값을 저장해줍니다.
				resultIndex++;
			}
		}

		for (int value : resultNumbers) // 정답으로만 구성된 배열을 하나씩 출력해주는데 0은 빼고 출력합니다.
		{
			if (value != 0)
				System.out.println(value);
		}

	}

}
