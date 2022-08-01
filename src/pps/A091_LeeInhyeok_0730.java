package pps;
/*
 * leetcode 27번
 */
public class A091_LeeInhyeok_0730 {
    public int removeElement(int[] nums, int val) {
        
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
        
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
