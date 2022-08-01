package pps;
/*
 * leetcode 67번 
 */
public class A063_LeeInhyeok_0728 {
	public String addBinary(String a, String b) {
		int i = a.length()-1;
		int j = b.length()-1;
		int total=0;
		
		StringBuilder sb = new StringBuilder();
		while(i>=0 || j>=0 || total>0) {
			if(i>=0) {
				total += a.charAt(i) - '0';
				i--;
			}
			
			if(j>=0) {
				total += b.charAt(j) - '0';
				j--;
			}
			sb.append(total % 2);
			total /= 2;
			
		}
		
		return sb.reverse().toString();
	}
}
