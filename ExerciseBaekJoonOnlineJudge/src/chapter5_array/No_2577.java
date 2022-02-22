package chapter5_array;

import java.util.Scanner;
public class No_2577 
{
	// 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
	// 예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고,
	// 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		/*	이런 방법으로도 할 수는 있겠지만, 너무 비효율적인 초기화 방법입니다. 
		 * 어차피 0에서 시작해서 9로 끝납니다. 
		 * 0 ~ n , 좀 익숙하지 않나요?
		 * 바로 배열의 인덱스입니다. 
		 
		int zero = 0;
		int one = 0;
		int two= 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		*/
		
		int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0 ,0}; // 각 배열의 인덱스가 하나의 숫자를 뜻합니다 ex) array[0] 은 0 , array[5] 는 5를 뜻함.
		
		int a = in.nextInt();	// 값을 3개 입력 받습니다. ( 3자리 수 )
		int b = in.nextInt();
		int c = in.nextInt();
		
		int result = a * b * c; // 값 3개를 곱한 값을 result 변수에 저장
		
		int count = 1;	// 지금부터 result의 자릿 수를 세어볼 count 입니다. 10으로 나누어 가면서 셀 것이기 때문에 하나가 모자라 미리 1로 초기화 했습니다.
		while( result > 10) // 10보다 작아질때 까지 10으로 나눌겁니다.
		{
			result /= 10;	// result에 10을 나눈 값을 저장하며 
			count++;	// 그때마다 count를 하나 씩 올립니다.
		}
		
		result = a * b * c;	// result 값을 다시 원래 대로 돌립니다.
		
		for( int i = 0 ; i < count ; i++) // 카운트의 갯수 만큼 반복을 돌려서 
		{
			array[result % 10]++; // ex) 1의자리가 만약 0이라면 array의 0번째에 값을 증가 시킵니다.
			result /= 10;	// result를 10으로 나눈 값을 다시 저장합니다. 그래야 다음 반복 때 다음 자리 수를 계산 할 수 있습니다.
		}
		
		for (int value : array)	// for - each 문으로 이제 배열의 원소를 하나씩 정답과 같이 출력합니다. cf) value자리는 초기화는 필요없고 앞에 type은 필요합니다.
			System.out.println(value);
		
	}

}
