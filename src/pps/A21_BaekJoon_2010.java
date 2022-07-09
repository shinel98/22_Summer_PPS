	package pps;
	
	import java.util.Scanner;
	
	public class A21_BaekJoon_2010 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int sum = 0;
			int num;
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			for(int i=0; i<n; i++) {
				num = sc.nextInt();
				sum+=num;
			}
			System.out.println(sum-(n-1));
		}
	
	}
