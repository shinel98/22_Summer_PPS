package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준 11721
 */
public class A047_LeeInhyeok_0714 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char[] str = bf.readLine().toCharArray();
		int flag=0;
		
		for(int i=0; i<str.length; i++) {
			System.out.print(str[i]);
			flag++;
			if(flag%10==0)
				System.out.println();
		}
	}

}
