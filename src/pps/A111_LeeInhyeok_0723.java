package pps;

import java.util.Scanner;

/*
 * 백준 9546 번 
 */
public class A111_LeeInhyeok_0723 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			int n = sc.nextInt();
			int ans = (int) (Math.pow(2, n) - 1);
			System.out.println(ans);
		}
	}

}
