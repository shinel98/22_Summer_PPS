package pps;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 백준 1755번 
 */
public class A086_LeeInhyeok_0722 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int size = N-M+1;
		Node[] node = new Node[size];
		
		
		int idx = M; 
		for(int i=0;i<size;i++) {
			node[i] = new Node(idx); 
			idx++;
		}

		Arrays.sort(node);
		for(int i=0;i<size;i++) {
			if(i!=0 && i%10 == 0) System.out.println();
			System.out.print(node[i].number+" "); 
		}
	}

}

class Node implements Comparable<Node> {
	String numToString[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	
	int number;
	int num10;
	int num1;
	String numberToString;
	
	
	public Node(int number) {
		this.number = number;
		num10 = number/10 ; 
		num1 = number % 10; 
		
		if(number >=10) {
			numberToString = numToString[num10]+" "+numToString[num1];
		}
		else {
			numberToString = numToString[num1];
		}
	}
	
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return this.numberToString.compareTo(o.numberToString);
	}
	
}