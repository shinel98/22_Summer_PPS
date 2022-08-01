package pps;

import java.util.Scanner;

public class A108_LeeInhyeok_0722 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T>0) {
			int n = sc.nextInt();
			String num = Integer.toString(n);
			String numReverse = "";
			
			for(int i=num.length()-1; i>=0; i--) {
				numReverse += num.charAt(i);
			}
			
			n += Integer.parseInt(numReverse);
			num = Integer.toString(n);
			numReverse = "";
			
			for(int i=num.length()-1; i>=0 ;i--){
				numReverse += num.charAt(i);
			}
			
			if(numReverse.equals(num)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			T--;
		}
	}
}
