package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class A18_BaekJoon_1026 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int[] frow = new int[N];
		Integer[] srow = new Integer[N];
		int total = 0;
		
		for(int i=0; i<N; i++) {
			frow[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(frow);
		
		st = new StringTokenizer(bf.readLine());
		for(int i=0; i<N; i++) {
			srow[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(srow, Comparator.reverseOrder());
	 
		for(int i=0; i<N; i++) {
			total += frow[i] * srow[i];
		}
		System.out.println(total);
	}

}
