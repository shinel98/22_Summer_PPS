package pps;

import java.util.Scanner;

/*
 * 백준 2775번 
 */

public class A032_LeeInhyeok_0712 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] floor = new int[15][15];
		int T = sc.nextInt();
		 
		
		for(int i=0; i<15; i++) {
			floor[0][i] = i;
			floor[i][1] = 1;
		}
		
		for(int i=0; i<T; i++) {
			
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			for(int j=1; j<=k; j++) {
				for(int l=2; l<=n; l++) {
					floor[j][l] = floor[j][l-1] +floor[j-1][l];
				}
			}
			System.out.println(floor[k][n]);
		}
		
	}

}
