package pps;
/*
 * leetcode 342번 
 */
public class A025_LeeInhyeok_0725 {
	public boolean isPowerOfFour(int n) {
       if (n <= 0) {
            return false;
        }
        while (n > 3) {
            if (n % 4 != 0) {
                return false;
            }
            n = n / 4;
        }
        return n == 1;
    }	
}
