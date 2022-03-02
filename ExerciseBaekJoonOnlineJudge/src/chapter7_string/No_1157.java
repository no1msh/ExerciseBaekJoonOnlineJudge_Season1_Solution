package chapter7_string;

import java.util.Scanner;

public class No_1157 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		// abcCount 배열은 각 알파벳과 입력되서 들어온 String값의 알파벳과 비교하여 중복되면 해당하는 원소의 값을 올려서 몇번 나왔는지를 알게합니다.
		int[] abcCount = new int[abc.length()]; // 초기화 시 기본 값으로 0이 들어갑니다.
		
		
		String inputStr = in.next();
		
		inputStr =inputStr.toUpperCase(); // 대소문자는 관계 없다 했으니 대문자로 통일 해줍니다.
		
		for (int i = 0; i < abc.length(); i++) // 들어온 String 값과 비교해 같으면 abc의 i번째 인덱스 값을 올림 ex) A가 있으면 A자리의 abcCount를 올림
		{
			for (int j = 0; j < inputStr.length(); j++)
			{
				if ( abc.charAt(i) == inputStr.charAt(j)) // 현재 검사중인 알파벳과 들어온 String의 알파벳 하나와 비교하여 중복되면 
					abcCount[i]++; // 값을 올립니다.
					
			}
		}
		
		int max = 0;
		int maxIndex = 0;
		for (int z = 0; z < abcCount.length; z++) // 지금부턴 abcCount 배열의 원소 중에 가장 큰 값을 찾아내고 Index값도 찾아냅니다.
		{
			if(abcCount[z] > max) // max 보다 원소 값이 크다면 
			{
				max = abcCount[z]; // max를 해당하는 값으로 변경해서 저장합니다.
				maxIndex = z; // 또한 그 때의 인덱스 값도 저장해줍니다.
			}
		}
		
		
		int countOverlap = 0; // 최대값이 중복인지 체크해줄 변수입니다.
		for (int z = 0 ; z < abcCount.length; z++) // 최대값이 중복인지를 체크해주는 반복입니다.
		{
			if (max == abcCount[z]) // max 와 abcCount의 원소가 같을 때 
				countOverlap++; // 중복 횟수를 체크합니다.
		}
		
		if (countOverlap > 1) // 두번이상 체크 되면 
			System.out.print("?"); // ?를 출력합니다.
		else
			System.out.println(abc.charAt(maxIndex)); // 그게 아니라면 가장 많이 반복된 알파벳을 출력해줍니다.

	}

}
