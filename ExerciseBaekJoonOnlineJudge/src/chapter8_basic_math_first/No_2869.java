package chapter8_basic_math_first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_2869 
{

	public static void main(String[] args) throws IOException 
	{
		// Scanner in = new Scanner(System.in);	Scanner를 사용하면 아무리 코드가 간략해도 시간 초과가 뜹니다.
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

		// 정답은 맞지만 그렇다고 해서 효율적인 코딩은 아님. ( 시간초과 ) 규칙성을 찾아 간소화 시켜 수학적 계산을 해보자.
//		while(true)
//		{
//			distance += A;
//			times ++;
//			if (distance >= V)
//				break;
//			distance -= B;
//			
//		} 

		// 달팽이는 무조건 낮에 도착을하기 때문에 마지막 값이 V - B
		// B라는 밤에 미끄러지는 거리는 결국 추가로 달팽이가 올라가야할 거리가 됩니다.
		// 그래서 마지막날엔 B를 빼주는 것이 계산되는 오류를 해결해야 합니다.
		// A-B 를 날마다 더해간다고 가정 했을 때 마지막날은 A로 끝나야 합니다. 왜냐 A가 늘 날마다 달팽이가 기어간 최대 거리니까요.
		// (A-B) * day 를 하면 day * A - day * B + B >= V
		// 여기서 +B 는 마지막날 차감이 되는 B를 다시 더해준 모습.
		// 식이 이쁘지 않기 때문에 정리를 해주면
		// day * A - day * B >= V - B
		// A-B 씩 하루하루 가다가 V를 넘기 전 에서 하루만 더 가주면 끝
		// 만약 0으로 딱 나누어 진다면? 그대로 출력해줍니다. 우리는 도착을 했을 때 B로 감소되는 과정을 미리 차단하였습니다.
		
		day = (V - B) / (A - B);

		if ((V - B) % (A - B) == 0) // 딱 나누어짐 >> 그대로 출력 마지막날 A만큼 추가된 값이 V값과 동일하게 되는 경우
			System.out.print(day);
		else {
			System.out.print(day + 1); // 딱 나누어 떨어지진 않은 경우 >> 조금 거리가 남았기에 다음날 한번만 더가주면 된다. 
		}

	}

}