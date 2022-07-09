package pps;

import java.util.Scanner;

public class A52_BaekJoon_8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] arr = new String[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.next();
		}
		
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			int zero_cnt = 0;
			
			for(int j=0; j<arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') 
					zero_cnt++;
				else 
					zero_cnt = 0;
				sum += zero_cnt;
			}
			System.out.println(sum);
		}
		
	}

}
