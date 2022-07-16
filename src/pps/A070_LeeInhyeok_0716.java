package pps;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * 백준 2164번 
 */
public class A070_LeeInhyeok_0716 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=1; i<=num; i++) {
			list.add(i);
		}
		while(list.size()>1){
			list.remove();
			list.add(list.remove());
		}
		System.out.println(list.remove());
	}

}
