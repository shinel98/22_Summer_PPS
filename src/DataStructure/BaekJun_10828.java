package DataStructure;

import java.util.Scanner;

public class BaekJun_10828 {
	
	public static int[] stack;
	public static int size = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		stack = new int[N];
		
		String choice;
		
		for(int i=0; i<N; i++) {
			choice = sc.next();
			
			switch(choice) {
			case "push":
				push(sc.nextInt());
				break;
			case "pop":
				sb.append(pop()).append("\n");
				break;
			case "size":
				sb.append(size()).append("\n");
				break;
			case "empty":
				sb.append(empty()).append("\n");
				break;
			case "top":
				sb.append(top()).append("\n");
				break;
			}
		}
		
		System.out.println(sb);
	}
	
	public static void push(int num) {
		stack[size++] = num;
	}
	
	public static int pop() {
		if(size == 0)
			return -1;
		int tmp = stack[size-1];
		stack[size-1] = 0;
		size--;
		return tmp;
	}
	
	public static int top() {
		if(size == 0)
			return -1;
		return stack[size-1];
	}
	
	public static int size() {
		return size;
	}
	
	public static int empty() {
		if(size == 0)
			return 1;
		else 
			return 0;
	}
	
}




