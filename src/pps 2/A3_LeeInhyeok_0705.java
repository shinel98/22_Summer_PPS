package pps;

public class A3_LeeInhyeok_0705 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution3 sol = new Solution3();
		int[] arr  = {9};
		sol.plusOne(arr);
	}

}

class Solution3 {
    public int[] plusOne(int[] digits) {
    	
    	int carry = 1;
    	int index = digits.length - 1;
    	
    	while(index>=0 && carry > 0) {
    		digits[index] = (digits[index] + 1) % 10;
    		
    		carry = (digits[index] == 0) ? 1 : 0;
    		index--;
    	}
    	
    	if(carry > 0) {
    		digits = new int[digits.length + 1];
    		digits[0] = 1;
    	}
    	
    	return digits;
    }
}