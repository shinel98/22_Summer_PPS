package pps;
/*
 *  프로그래머스 42747번 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class A078_LeeInhyeok_0730 {
    public static int solution(int[] citations) {
    	
        ArrayList<Integer> list = new ArrayList<>();
        for (int count : citations)
            list.add(count);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.intValue() - o1.intValue();
            }
        });

        int index = 0;
      
        while (index < list.size()) {
            if (list.get(index) <= index) 
            	break;
            index++;
        }

        return index;
    }
}