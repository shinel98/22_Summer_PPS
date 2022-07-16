package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준 5598번 
 */
public class A050_LeeInhyeok_0715 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		char[] answer = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c-'A' < 3) {
				answer[i] = (char) (c + 23);
			}
			else {
				answer[i] = (char) (c - 3);
			}
		}
		
		System.out.println(answer);
	}

}
