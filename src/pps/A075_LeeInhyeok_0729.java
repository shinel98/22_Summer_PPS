package pps;
/*
 * 프로그래머스 42746번 
 */
import java.util.Arrays;
import java.util.Comparator;

public class A075_LeeInhyeok_0729 {
    public String solution(int[] numbers) {
        
        String answer = "";
        String[] array = new String[numbers.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2 + s1).compareTo(s1 + s2); 
            }
        });

        for (int i = 0; i < array.length; i++) {
            answer += array[i];
        }

        if (answer.startsWith("0")) {
            answer = "0";
        }

        return answer;
    }
}