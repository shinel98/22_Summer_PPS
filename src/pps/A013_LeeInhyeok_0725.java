package pps;

/*
 * leetcode 136번 
 */
import java.util.Arrays;

public class A013_LeeInhyeok_0725 {

	 public int singleNumber(int[] nums) {
	        Arrays.sort(nums);
	        
	        if(nums.length == 1)
	            return nums[0];
	        
	        for(int i=0; i<nums.length-1; i=i+2) {
	            if(nums[i] != nums[i+1])
	                return nums[i];
	        }
	        return nums[nums.length-1];
	    
	    }

}
