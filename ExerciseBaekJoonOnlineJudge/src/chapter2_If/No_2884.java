package chapter2_If;

import java.util.Scanner;
public class No_2884 
{
	/*
	 * 창영이의 방법은
	 * 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 
	 * 어차피 알람 소리를 들으면, 알람을 끄고 조금 더 잘 것이기 때문이다.
	 * 이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.
	 * 현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 
	 * 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int hour = in.nextInt();
		int minute = in.nextInt();
		int temp = 0;
		
		if (minute >= 45)
		{
			minute -= 45;
			System.out.print(hour + " " + minute);
		} 
		else	// 입력 받은 분이 45보다 작을 때 시간은 한시간 내립니다.
		{
			if ( hour == 0)	// 허나 단순 산수계산이 아니라 시간 계산이기 때문에 0시에서 한시간 내리면 23시 입니다.
				hour = 23;
			else	// 그 외의 시간은 한시간을 빼주면 됩니다.
				hour -= 1;
			
			temp = minute -45;	// 입력 받은 분에서 45분을 뺀 값입니다. 당연히 음수로 나오겠죠? 임시변수에 저장해줍시다.
			minute = 60 + temp; 	// 이제 다시 60분에서 임시저장된 값을 빼주면 우리가 원하는 45분 뺀 분이 나옵니다.
			
			System.out.print(hour + " " + minute);
		}
	}

}
