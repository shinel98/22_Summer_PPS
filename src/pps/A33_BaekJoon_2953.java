package pps;

import java.util.Scanner;

public class A33_BaekJoon_2953 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int max_index = 0;
		for(int i=0; i<5; i++) {
			int total = 0;
			
			for(int j=0; j<4; j++) {
				total += sc.nextInt();
			}
			if(total > max) {
				max = total;
				max_index = i+1;
			}
		}
		System.out.println(max_index + " " + max);
	}

}
