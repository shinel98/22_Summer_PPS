package pps;
/*
 * 백준 5639번 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B012_LeeInhyeok_0720 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input;
		Node node = new Node(Integer.parseInt(bf.readLine()));
		
		while(true) {
			input = bf.readLine();
			if(input == null || input.equals(""))
				break;
			node.insert(Integer.parseInt(input));
		}
		postOrder(node);
	}
	
	private static class Node {
		int num;
		Node left, right;
		
		Node(int num){
			this.num = num;
		}
		
		public void insert(int num) {
			if(num < this.num) {
				if(this.left != null) {
					this.left.insert(num);
				} else {
					this.left = new Node(num);
				}
			}
			else {
				if(this.right != null) {
					this.right.insert(num);
				} else {
					this.right = new Node(num);
				}
			}
		}
	}
	
	private static void postOrder(Node node) {
		if(node.left != null) {
			postOrder(node.left);
		}
		if(node.right != null) {
			postOrder(node.right);
		}
		System.out.println(node.num);
	}
	
}
