package pps;

import java.util.Scanner;

/*
 * 3059번 
 */
public class A106_LeeInhyeok_0716 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			int total = 0;
			String str = sc.next();
			int[] arr = new int[26];
			
			for(int j=0; j<str.length(); j++) {
				arr[str.charAt(j)-'A'] = 1;
			}
			
			for(int j=0; j<26; j++) {
				if(arr[j] == 0) {
					total = total + j + 65;
				}	
			}
			System.out.println(total);
		}
		
	}

}
