package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A19_LeeInhyeok_0707 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[3];
		int ans = 1;
		for(int i=0; i<3; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
			ans *= arr[i];
		}
		
		String answer = String.valueOf(ans);
		int[] countNum = new int[10];
		for(int i=0; i<answer.length(); i++) {
			countNum[answer.charAt(i)-'0']++;
		}
		
		for(int i=0; i<10; i++)
			System.out.println(countNum[i]);
	}

}
