package pps;
/*
 * leetcode 258번 
 */
public class A023_LeeInhyeok_0728 {
	public int addDigits(int num) {
		int total = 0;
		while(num>0) {
			total += num % 10;
			num = num / 10;
			
			if(total>9 && num==0) {
				num = total;
				total = 0;
			}
		}
		
		return total;
	}
}
