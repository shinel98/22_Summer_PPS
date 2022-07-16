package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A045_LeeInhyeok_0712 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int max = -1;
		int count = 0;
		char max_char = 0;
		String str = bf.readLine();
		str = str.toUpperCase();
		
		int[] count_arr = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			count_arr[str.charAt(i)-'A']++; 
		}
		
		for(int i=0; i<26; i++) {			
			if(count_arr[i] > max) {
				max = count_arr[i];
				max_char = (char)(i+65);
			}
			else if(count_arr[i] == max) {
				max_char = '?';
			}
		}
		System.out.println(max_char);
		
	}

}
