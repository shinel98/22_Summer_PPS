package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A046_LeeInhyeok_0712 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[] count = new int[26];
		int max = -1;
		char max_char = 0;
		int flag=0;
		
		for(int i=0; i<N; i++) {
			String s = bf.readLine();
			count[s.charAt(0)-'a']++;
		}
		
		for(int i=0; i<26; i++) {
			if(count[i] >= 5)
			{
				max_char = (char)(97 + i);
				System.out.print(max_char);
				flag = 1;
			}
		}
		if(flag == 0)
			System.out.println("PREDAJA");
	}	

}
