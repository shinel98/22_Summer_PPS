package pps;

import java.util.Scanner;

/*
 * 백준 1316번 
 */
public class A048_LeeInhyeok_0714 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = N;
		int[] arr = new int[26];
		for(int i=0; i<N; i++) {
			String s = sc.next();
			if(s.length() == 1) 
				continue;
			
			for(int j=0; j<s.length()-1; j++) {	
				if(s.charAt(j) != s.charAt(j+1)){
					arr[s.charAt(j)-'a']++;		
				}
			}
			arr[s.charAt(s.length()-1)-'a']++;
			for(int j=0; j<26; j++) {
				if(arr[j] > 1) {
					count--;
					break;
				}
			}
			for(int j=0; j<26; j++)
				arr[j] = 0;
		}
		System.out.println(count);
	}

}
