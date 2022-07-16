package pps;

import java.util.Scanner;

/*
 * 백준 2163번 
 */
public class A031_LeeInhyeok_0712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int count=0;
		count = N-1;
		for(int i=0; i<N; i++) {
			count += M-1;
		}
		System.out.println(count);
	}

}
