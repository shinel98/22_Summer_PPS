package pps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A4_LeeInhyeok_0705 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution4 sol = new Solution4();
		int[] arr = {5,9,7,10};
		int divisor = 5;
		sol.solution(arr, divisor);
	}
}

class Solution4 {
	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		
		List<Integer> list = new ArrayList<>();
		
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % divisor == 0) {
				list.add(arr[i]);
			}	
		}
		if(list.size() == 0) {
			answer = new int[list.size() + 1];
			answer[0] = -1;
			return answer;
		}
		
		answer = new int[list.size()];
		for(int i=0; i<list.size(); i++) {		
			answer[i] = list.get(i).intValue();
		}
		Arrays.sort(answer);
		return answer;
	}
}