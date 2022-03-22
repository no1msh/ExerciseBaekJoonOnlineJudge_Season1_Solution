package chapter9_basic_math_second;

import java.io.*;

public class No_3053 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		double uclid = 0.0;
		double taxi = 0.0;
		
		int r = Integer.parseInt(br.readLine());
		
		uclid = Math.PI * r * r;
		taxi = 2 * r * r;
		
		sb.append(uclid).append("\n").append(taxi);
		System.out.print(sb.toString());
	}

}
