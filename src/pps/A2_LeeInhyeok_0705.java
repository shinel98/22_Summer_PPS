package pps;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class A2_LeeInhyeok_0705 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numRows = sc.nextInt();
		Solution2 sol = new Solution2();
		sol.generate(numRows);
		
		System.out.println(sol.generate(numRows));
		
		
	}
}
class Solution2 {
	
	public List<List<Integer>> generate(int numRows){
		List<List<Integer>> llist = new LinkedList<>();
		int prev, next;
		for(int i=0; i<numRows; i++) {
			List<Integer> list = new LinkedList<>();
			for(int j=0; j<=i; j++) {
				if(j==0 || j== i)
					list.add(1);
				else {
					prev = llist.get(i-1).get(j-1);
					next = llist.get(i-1).get(j);
					list.add(prev+next);
				}	
			}
			
			llist.add(list);
		}
		return llist;
	}
}
