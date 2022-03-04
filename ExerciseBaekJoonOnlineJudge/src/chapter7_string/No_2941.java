package chapter7_string;

import java.util.Scanner;

public class No_2941 
{
	//  ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
	public static void main(String[] args) 
	{
		// 크로아티아 알파벳은 다음과 같이 있습니다. "c=","c-","dz=","d-","lj","nj","s=","z="
		
		Scanner in = new Scanner(System.in);
		
		String inputStr = in.nextLine();
		int count = inputStr.length();
		
		
		for (int i = 0 ; i < inputStr.length(); i++)
		{
			if(i+1 < inputStr.length() && inputStr.charAt(i) == 'c' ) // c로 시작할 때 뒤에 = 일때 - 일때 
			{
				if (inputStr.charAt(i+1) == '=' || inputStr.charAt(i+1) == '-')
				{
					count -= 1;
					i+=1; // 다음반복은 넘겨줍니다.
				}
			}
			
			if (inputStr.charAt(i) == 'd') // d로 시작할때 z= 이나 -로 끝날 때
			{
				
				if (i+2 < inputStr.length() && inputStr.charAt(i+1) == 'z' && inputStr.charAt(i+2) == '='	) 
				{
					count -=2;
					i+=2;
				}
				else if (i+1 < inputStr.length() && inputStr.charAt(i+1) == '-')
				{
					count -=1;
					i+=1;
				}
					
			}
			
			if (i+1 < inputStr.length() && inputStr.charAt(i) == 'l')
			{
				if (inputStr.charAt(i+1) == 'j')
				{
					count -=1;
					i+=1;
				}
			}
			
			if (i+1 < inputStr.length() && inputStr.charAt(i) == 'n')
			{
				if (inputStr.charAt(i+1) == 'j')
				{
					count -=1;
					i+=1;
				}
			}
			
			if (i+1 < inputStr.length() && inputStr.charAt(i) == 's')
			{
				if (inputStr.charAt(i+1) == '=')
				{
					count -=1;
					i+=1;
				}
			}
			
			if (i+1 < inputStr.length() && inputStr.charAt(i) == 'z')
			{
				if (inputStr.charAt(i+1) == '=')
				{
					count -=1;
					i+=1;
				}
			}
		}
		
		System.out.println(count);
	}

}
