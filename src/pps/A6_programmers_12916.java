package pps;

public class A6_programmers_12916 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution6 {
    boolean solution(String s) {
        boolean answer = true;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        String[] s_array = s.split("");
        int p_count=0;
        int y_count=0;
        for(int i=0; i<s.length(); i++) {
        	if(s_array[i].equalsIgnoreCase("p")) {
        		p_count++;
        	}
        	else if(s_array[i].equalsIgnoreCase("y")) {
        		y_count++;
        	}
        }
        if(p_count == y_count)
        	answer = true;
        else
        	answer = false;
        return answer;
    }
}