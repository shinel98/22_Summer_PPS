package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class A17_LeeInhyeok_0707 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int max=0;
		String input = bf.readLine();
		
		int[] nSet = new int[10];
		int count=0;
		
		for(int i=0; i<input.length(); i++) {
			nSet[input.charAt(i)-'0']++;
		}
		
		for(int i=0; i<10; i++) {	
			if(i == 6 || i == 9) {
				count += nSet[i];
				continue;
			}
			if(nSet[i] > max)
				max = nSet[i];
			
		}
		if(count%2==0) {
			if(count/2 > max)
				max = count/2;
		}
		else {
			if(count/2+1 > max)
				max = count/2 + 1;
		}
		
		
		System.out.println(max);
	}

}
