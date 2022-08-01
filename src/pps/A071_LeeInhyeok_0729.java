package pps;

/*
 * leetcode 232번 
 */
import java.util.Stack;

public class A071_LeeInhyeok_0729 {
	private Stack<Integer> stk1 = new Stack<>();
	private Stack<Integer> stk2 = new Stack<>(); 
    
    public void push(int x) {

        while(!stk1.isEmpty()){  
            stk2.push(stk1.pop());
        }
        stk1.push(x); 

        while(!stk2.isEmpty()){ 
            stk1.push(stk2.pop());
        }

    }
    public int pop() {
        return stk1.pop();
    }

    public int peek() {
        return stk1.peek();
    }
    
    public boolean empty() {
        return stk1.isEmpty();
    }
}

