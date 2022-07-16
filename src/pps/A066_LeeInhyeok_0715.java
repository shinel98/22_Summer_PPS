package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/*
 *백준 1427번 
 */
public class A066_LeeInhyeok_0715 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] arr =bf.readLine().split("");
		Integer[] num = new Integer[arr.length];
		for(int i=0; i<arr.length; i++) {
			num[i] = Integer.parseInt(arr[i]);
		}
		
		Arrays.sort(num, Collections.reverseOrder());
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]);
		}
	}
}
