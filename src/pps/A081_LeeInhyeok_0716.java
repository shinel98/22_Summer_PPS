package pps;

import java.util.Scanner;

/*
 * 백준 2693번 
 */
public class A081_LeeInhyeok_0716 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			
			int k =0;
			int[] arr = new int[10];
			
			for(int j=0; j<arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			
			while(k<3) {
				
				int max_index = 0;
				int max=0;
				
				for(int j=0; j<arr.length; j++) {
					if(k < 3 && arr[j] > max) {
						
						max = arr[j];
						max_index = j;
					}
				}
				
				if(k == 2) { 
					System.out.println(max);
				}
				
				arr[max_index] = 0;
				k++;
 			}
		}	
	}
}
