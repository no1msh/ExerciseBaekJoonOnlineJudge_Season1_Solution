package chapter4_while;

import java.util.Scanner;

public class No_1110 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		int temp = -1;	// 초기 값으로 입력한 수랑 같지 못하게 음수로 정한다.
		int count = 0;	// 계산이 반복 될때마다 1씩 추가 된다.
		int a = in.nextInt();
		int b = a;

		while (temp != b) // 계산된 수랑 원래의 수가 같아질 때 까지 실행된다.
		{
			temp = a % 10 * 10 + ((a / 10 + a % 10) % 10);	// 계산식
			count++;	// 계산이 한번 완료 될 때 마다 카운트에 1추가

			if (temp == b) // 만약 계산된 수와 원래 입력 받은 수가 같다면
			{
				System.out.print(count);	// 몇번 사이클을 돌았는지 출력
				break;		// 반복 종료
			}
			a = temp;	// 반복이 종료 되지 않았을 때 다음 계산을 위해 a에 계산된 값을 집어넣고
			temp = -1;	// 계산값이 또 저장될 temp는 다시 초기화를 한다.

		}
	}
}
