package chapter3_for;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class No_15552 
{
	// 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 
	// 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
	// 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
	// Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));	// 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		
		String n = bf.readLine(); // 몇번 반복 할건지 입력 받습니다.
		int times = Integer.parseInt(n);
		
		for (int i = 0; i < times ; i++)
		{
			String s = bf.readLine(); // String
			
			String array[] = s.split(" "); //공백마다 데이터 끊어서 배열에 넣음
			
			int a = Integer.parseInt(array[0]); //첫번째 호출
			int b = Integer.parseInt(array[1]); //두번째 호출

			int sum = a+b;
			
			
			bw.write(sum+"\n");	// 버퍼에 있는 값 전부 출력
		}
		
		bw.flush();	// 남아있는 데이터를 모두출력시킴
		bw.close();	// 스트림을 닫습니다.
	}

}