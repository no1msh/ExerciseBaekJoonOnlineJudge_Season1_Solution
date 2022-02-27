package chapter6_method;

import java.util.Scanner;

public class No_1065 {
	 // 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
	//등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
	// N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.

	static boolean isHansu(int n) // boolean 타입으로 한수를 체크해주는 메소드입니다. 
	{
		int a = 0;
		int b = 0;
		int c = 0;
		
		if (n < 100)
			return true;
		
		else 
		{
			a = n / 100;
			b = n / 10 % 10;
			c = n % 10;
			
			if (a-b == b-c)
				return true;
		}
		return false; // 기본 리턴 값 
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int count = 0; // 한수를 세어줄 변수
		
		// 범위는 1부터 시작해서 1000까지 이나 1000은 이미 한수가 아닙니다. 그러므로 제외하고 세자리수가 최대로만 봅시다.
		// 또한 1부터 99 까지는 비교대상이 애초에 두개 이하라 무조건 한수입니다.
		// 문제는 세자리 숫자 부터인데 이때부턴 자리 수를 나누어 각각 비교해보기로 합시다.
		
		for (int i = 1 ; i <= n ; i++)	// 1부터 시작하여 입력한 값까지의 한수를 체크 해서 
		{
			if (isHansu(i)) // 한수가 맞다면
				count++;	// 카운트를 하나씩 늘려 줍시다.
				
		}
		
		System.out.print(count);	// 반복이 끝나면 count를 출력해줍니다. 

	}

}
