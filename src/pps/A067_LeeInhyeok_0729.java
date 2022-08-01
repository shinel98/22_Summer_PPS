package pps;

/*
 * leetcode 1047번 
 */
import java.util.LinkedList;

public class A067_LeeInhyeok_0729 {
	 public String removeDuplicates(String S) {
		    LinkedList<Character> list = new LinkedList<>();
		    char[] arr = S.toCharArray();
		    
		    for (char c : arr) {
		        if (!list.isEmpty() && list.getLast() == c) {
		            list.removeLast();
		        } else {
		            list.addLast(c);
		        }
		    }
		    
		    if (list.size() == 0) return "";
		    StringBuilder sb = new StringBuilder();
		    
		    while (list.size() != 0) 
		    	sb.append(list.removeFirst());
		    
		    return sb.toString();
	 }
}
