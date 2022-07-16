package pps;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class A083_LeeInhyeok_0716 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		HashSet<Integer> set = new HashSet<>(); 
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			set.add(sc.nextInt());
		}
		
		LinkedList<Integer> list = new LinkedList<>(set);
		Collections.sort(list);
		for(int i: list) {
			System.out.print(i + " ");
		}
	}

}
