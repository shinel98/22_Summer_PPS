package pps;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * 백준 2822번 
 */
public class A077_LeeInhyeok_0716 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[8];
		int[] index_arr = new int[5];
		int num;
		int total = 0;
		int j=0;
		
		for(int i=0; i<8; i++) {
			arr[i] = sc.nextInt();
		}
		
		while(j<5) {
			int index=-1;
			int max_index = 0;
			int max = 0;
			
			for(int i=0; i<arr.length; i++) {
				if(arr[i]>max) {
					max = arr[i];
					max_index = i;
				}
			}
			total += max;
			index_arr[j++] = max_index+1;
			arr[max_index] = 0;
			
		}
		Arrays.sort(index_arr);
		System.out.println(total);
		for(int i=0; i<index_arr.length; i++) {
			System.out.print(index_arr[i] + " ");
		}
	}

}
