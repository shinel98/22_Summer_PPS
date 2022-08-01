package pps;

/*
 * leetcode 1051번 
 */
import java.util.Arrays;

public class A064_LeeInhyeok_0729 {
	 public int heightChecker(int[] heights) {
		 
		 	int[] expected = new int[heights.length];
	        for(int i=0; i<heights.length; i++) {
	        	expected[i] = heights[i];
	        }
	        Arrays.sort(expected);

	        int count = 0;
	        for(int i=0;i<heights.length;i++){
	            if(heights[i] != expected[i]){
	                count++;
	            }
	        }

	        return count;
	    }
}
