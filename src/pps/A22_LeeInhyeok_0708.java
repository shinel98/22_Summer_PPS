package pps;

import java.util.Scanner;

public class A22_LeeInhyeok_0708 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = 0;
		int Y = 0;
		
		int N = sc.nextInt();
		int[] time = new int[N];
		for(int i=0; i<N; i++) {
			time[i] = sc.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			Y += (time[i]/30 + 1) * 10;
			M += (time[i]/60 + 1) * 15;
		}
		
		if(Y < M) {
			System.out.print("Y " + Y);
		}
		else if(Y > M) {
			System.out.print("M " + M);
		}
		else {
			System.out.println("Y M " + M);
		}
	}

}

