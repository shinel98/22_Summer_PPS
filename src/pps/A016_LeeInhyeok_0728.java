package pps;
/*
 * 프로그래머스 42885번 
 */
import java.util.Arrays;

public class A016_LeeInhyeok_0728 {
	public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;

        while (left != right && left < right) {
            
        	int w = people[right];
            
            for (int i = left; i < right; i++) {
                w += people[i];
                if (w == limit) {
                    left = i + 1;
                    right--;
                    answer++;
                    break;
                } 
                else if (w > limit) {
                    left = i;
                    right--;
                    answer++;
                    break;
                }
                else {
                    if (i == right - 1) {
                        left = i;
                        right--;
                    }
                }
            }
        }
        if(left==right)
        	return answer+1;
        else
        	return answer;
        
    }
}
