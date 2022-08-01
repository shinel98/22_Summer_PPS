package pps;

import java.util.Scanner;
 
public class A105_LeeInhyeok_0722 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
 
		int cross_count = 1;
		int sum = 0;
 
		while (true) {
			if (X <= sum + cross_count) {	
				
				if (cross_count % 2 == 1) {	 
					 
					System.out.print((cross_count - (X - sum - 1)) + "/" + (X - sum));
					break;
				} 
				
				else {	 
					
					System.out.print((X - sum) + "/" + (cross_count - (X - sum - 1)));
					break;
				}
 
			} else {
				sum += cross_count;
				cross_count++;
			}
		}
	}
}