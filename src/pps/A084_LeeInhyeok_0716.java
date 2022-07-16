package pps;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * 백준 11656번 
 */
public class A084_LeeInhyeok_0716 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String[] str_arr = new String[str.length()];
		for(int i=0; i<str.length(); i++) {
			str_arr[i] = str.substring(i,str.length());
		}
		Arrays.sort(str_arr);
		for(int i=0; i<str.length(); i++) {
			System.out.println(str_arr[i]);
		}
	}

}
