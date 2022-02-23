package chapter5_array;

import java.util.Scanner;

public class No_3052 
{
	// 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
	// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int[] numbers = new int[10] ; // 입력받은 값들을 저장해줄 배열입니다. 
		int[] remain = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }; // 나머지 값을 저장할 배열입니다. 나머지가 0일 수 있기에 -1로 초기화를 해줍니다. 
		int count = 0 ; // 서로 다른 나머지가 몇 개 있는지 세어줄 변수입니다.
		boolean overlap = false;	// 나머지 값들이 중복하는지 체크해줄 boolean 타입 변수 입니다.
		
		for (int i = 0 ; i < numbers.length; i++)
		{
			numbers[i] = in.nextInt();
			
			for ( int value : remain)	// remain 배열에 들어있는 원소를 하나씩 가져와서 value에 넣어줍니다. 
			{
				
				if ( numbers[i] % 42 == value) // remain 배열의 원소중 우리가 계산한 나머지의 값이 똑같이 있다면 반복을 종료합니다.
					{
						overlap = true;
						break;
					}
		
			}
			
			if (!overlap)
			{
				remain[i] = numbers[i] % 42;	// 중복되는 값이 없다면 42로 나눈 값을 바로 remain 배열에 원소로 추가해줍니다.
				count ++; // 값이 들어갈 때 마다 세어줍니다. ( 값이 들어간다 >> 기존 나머지 값과 안겹치는 값이 하나 생겼다. count 1증가
			}
			
			overlap = false; // 한바퀴가 돌면 다시 중복을 물어보는 변수를 초기화 해줍니다.
		}
		System.out.print(count);
	}
}