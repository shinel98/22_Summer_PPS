package pps;
/*
 * leetcode 26번
 */
public class A090_LeeInhyeok_0730 {
	public int removeDuplicates(int[] nums) {
        int index = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index++] = nums[i + 1];
            }
        }
        return index;
    }
}
