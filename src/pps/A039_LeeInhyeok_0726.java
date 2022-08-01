package pps;
/*
 * leetcode 367번 
 */

public class A039_LeeInhyeok_0726 {
	
	public boolean isPerfectSquare(int num) {
		if(num==1) return true;
		int start = 1;
		int end = num /2;
		
		while(start <= end) {
			float mid = start + (end- start)/2;
			if(mid < (float)num/mid){
				start = (int)mid+1;
			}
			else if(mid > (float)num/mid){
				end = (int)mid-1;
			}
			else{
				return true;
			}
		}
		return false;
	} 
}
