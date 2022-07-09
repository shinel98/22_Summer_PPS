package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A7_BaekJoon_2920 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine();	
		String[] temp = input.split(" ");
		int[] arr = new int[temp.length];
		for(int i=0; i<temp.length; i++) {
			arr[i] = Integer.parseInt(temp[i]);
		}
		int asc = 0;
		int desc = 0;
		
		for(int i=0; i<arr.length-1; i++){
			if(arr[i+1]-arr[i] != 1) {
				desc = 1;
			}
			if(arr[i]-arr[i+1] != 1) {
				asc = 1;
			}
		}
		
		if(asc == 1 && desc == 1) {
			System.out.println("mixed");
		}
		else if(asc == 1 && desc == 0) {
			System.out.println("ascending");
		}
		else if(asc == 0 && desc == 1) {
			System.out.println("descending");
		}
		
		
	}

}

