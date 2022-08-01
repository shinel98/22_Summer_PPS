package pps;
/*
 * leetcode 228번 
 */
import java.util.ArrayList;
import java.util.List;

public class A014_LeeInhyeok_0728 {
	public List<String> summaryRanges(int[] nums) {
        List<String> summary = new ArrayList<String>();
        
        if(nums.length == 0) 
        	return summary;
        
        String subRange="";
        
        int start=nums[0];
        
        for(int i=1;i<nums.length;i++) {
            
        	if(nums[i-1]+1 != nums[i]) { 
                subRange = getRange(start, nums[i-1]);
                summary.add(subRange);
                start = nums[i];
            }
        }
        
        subRange = getRange(start, nums[nums.length-1]);
        summary.add(subRange);
        
        return summary;
    }
    
    public String getRange(int start, int end) {
        StringBuilder sb = new StringBuilder();
        sb.append(start);
        
        if(start != end) 
        	sb.append("->").append(end);
        
        return sb.toString();
    }
}
