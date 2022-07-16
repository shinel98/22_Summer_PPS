package pps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * 백준 10814번 
 */
public class A082_LeeInhyeok_0716 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		String[][] arr = new String[N][2];
		
		for(int i=0; i<N; i++) {
			arr[i][0] = sc.next();
			arr[i][1] = sc.next();
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {
			
			
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}	
		});
		
		for(int i=0; i<N; i++) {
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
		}
		System.out.println(sb);
	}

}
