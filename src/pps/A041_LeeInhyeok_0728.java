package pps;
/*
 * 프로그래머스 12951번 
 */
public class A041_LeeInhyeok_0728 {
	public String solution(String s) {
	    StringBuilder sb = new StringBuilder();
	 
	    boolean hasFirst = true;
	 
	    for (int i = 0; i < s.length(); i++) {
	        if (s.charAt(i) == ' ') {
	            sb.append(s.charAt(i));
	            hasFirst = true; 
	        } else {
	            if (hasFirst) { 
	                sb.append(String.valueOf(s.charAt(i)).toUpperCase());
	                hasFirst = false; 
	            } else {
	                sb.append(String.valueOf(s.charAt(i)).toLowerCase());
	            }
	        }
	    }
	 
	    return sb.toString();
	}
}
