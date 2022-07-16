package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * 백준 18258번 
 */
public class A069_LeeInhyeok_0715 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
		int interval = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=people; i++) {
			list.add(i);
		}
		sb.append("<");
		
		int i=0;
		while(list.size()>1) {
			i = (i + (interval-1))%list.size();
			
			sb.append(list.remove(i)).append(", ");
		}
		
		sb.append(list.remove()).append(">");
		System.out.println(sb);
	}

}
