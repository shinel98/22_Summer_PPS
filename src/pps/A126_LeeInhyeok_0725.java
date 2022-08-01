package pps;

import java.util.Scanner;

/*
 * 백준 1065번 
 */
public class A126_LeeInhyeok_0725 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0; 
		int num = sc.nextInt();
		
		 
		if (num < 100) {
			System.out.println(num);
			return;
		}
 
		else {
			cnt = 99;
 
			for (int i = 100; i <= num; i++) {
				int hun = i / 100; 
				int ten = (i / 10) % 10; 
				int one = i % 10;
 
				if ((hun - ten) == (ten - one)) { 
					cnt++;
				}
			}
		}
 
		System.out.println(cnt);
		return;
	}

}




