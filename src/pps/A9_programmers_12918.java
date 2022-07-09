package pps;

public class A9_programmers_12918 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}

}

class Solution9 {
	public boolean solution(String s) {
		
		boolean answer = false;
		if(s.length() == 4 || s.length() == 6)
				answer = true;
		
		for(int i=0; i<s.length(); i++) {
			if(!Character.isDigit(s.charAt(i)))
				answer = false;
		}

		return answer;
	}
}