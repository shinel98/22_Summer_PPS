package pps;

import java.util.Scanner;

public class A21_BaekJoon_2455 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int total = 0,maxTotal = 0;
        int out, in;
        
        for(int i=0;i<4;i++) {
            out = sc.nextInt();
            in = sc.nextInt();
            total = total-out+in;
            maxTotal = Math.max(maxTotal,total);
        }
        System.out.println(maxTotal);
    }

}
