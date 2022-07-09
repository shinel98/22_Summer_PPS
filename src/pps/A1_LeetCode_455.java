package pps;

import java.util.Arrays;
import java.util.LinkedList;

public class A1_LeetCode_455 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		int[] g = {2,3,4};
		int[] s = {1,2};
		
		
		System.out.println(sol.findContentChildren(g, s));
	}

}
/*
 * Constraints
 	1 <= g.length <= 3 * 104
	0 <= s.length <= 3 * 104
	1 <= g[i], s[j] <= 231 - 1
 */
class Solution{
	public int findContentChildren(int[]g, int[]s) {
		if(s.length == 0 || g.length == 0)
			return 0;
		
		Arrays.sort(g);
		Arrays.sort(s);
		
		int i=0;
		int j=0;
		
		do {
		if (g[i] > s[j]) {	
			j++;
		}
		else { 
			i++;
			j++;
		}
		if(i >= g.length || j >= s.length)
			break;
		}while(true);
		
		return i;
	}
}
