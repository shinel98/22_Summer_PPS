package pps;

import java.util.Scanner;
/*
 * 백준 1934 
 */
public class A127_LeeInhyeok_0725 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
        
		StringBuilder sb = new StringBuilder();
 
		
		for(int i = 0; i < N; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int d = func(a, b);	
			
			sb.append(a * b / d).append('\n');
		}
		System.out.println(sb);
	}
	
	public static int func(int a, int b) {
	
		while (b != 0) {
			int remainder = a % b; 
			a = b;
			b = remainder;
		}
		return a;
	}
}

