package pps;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class A34_LeeInhyeok_0709 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Set<Integer> hset = new HashSet<Integer>();
 
		for (int i = 0; i < 10; i++) 
			hset.add(sc.nextInt() % 42);
		
		System.out.print(hset.size());
	}

}

 
