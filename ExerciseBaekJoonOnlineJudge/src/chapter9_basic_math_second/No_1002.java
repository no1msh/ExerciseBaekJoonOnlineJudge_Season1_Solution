package chapter9_basic_math_second;

import java.io.*;
import java.util.StringTokenizer;

public class No_1002 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb= new StringBuilder();
		
		int testCase = Integer.parseInt(br.readLine());
	
		int i = 0;
		
		while (i < testCase) {
			
			i++;
			st = new StringTokenizer(br.readLine(), " ");
			
			int x1, y1, r1, x2, y2, r2;
			int distance;
			
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			r1 = Integer.parseInt(st.nextToken());
			
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			r2 = Integer.parseInt(st.nextToken());

			distance = (int) (Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2)); 
			
			if (x1 == x2 && y1== y2 && r1 == r2) 
				sb.append(-1).append("\n");
			else if (distance > Math.pow(r1+r2,2) || distance < Math.pow(r1-r2,2))
				sb.append(0).append("\n");
			else if (distance == Math.pow(r1+r2,2)|| distance == Math.pow(r1-r2,2))
				sb.append(1).append("\n");
			else 
				sb.append(2).append("\n");
			
		}
		br.close();
		System.out.print(sb.toString());
	}
}