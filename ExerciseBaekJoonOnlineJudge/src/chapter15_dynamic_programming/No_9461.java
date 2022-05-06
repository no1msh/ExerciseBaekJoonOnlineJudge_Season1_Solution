package chapter15_dynamic_programming;

import java.io.*;

public class No_9461 {
	 
	static long[] seq = new long[101];
	
    public static void pado() {
		seq[1] = 1;
		seq[2] = 1;
		seq[3] = 1;
        
		for (int i = 4; i < 101; i++) {
			seq[i] = seq[i - 2] + seq[i - 3];
		}
	}
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		pado();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			sb.append(seq[Integer.parseInt(br.readLine())]).append('\n');
		}
		
		System.out.println(sb);
	}
 
}