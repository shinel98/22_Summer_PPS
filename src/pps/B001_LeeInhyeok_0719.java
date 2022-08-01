package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 백준 2606번 
 */
public class B001_LeeInhyeok_0719 {
	static int[][] nodes;
	static int[] visited; 
	static int cnt;
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int pairs = sc.nextInt();
		
		nodes = new int[N+1][N+1];
		visited = new int[N+1];
		
		for(int i=0; i<pairs; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			nodes[n1][n2] = 1;
			nodes[n2][n1] = 1;
		}
		//int result = BFS(1);
		DFS(nodes, visited, 1);
		System.out.println(cnt-1);
	}
	public static int BFS(int start) {
		Queue<Integer> q = new LinkedList<>();
		int count = 0;
		
		visited[start] = 1;
		q.offer(start);
		while(!q.isEmpty()) {
			int num = q.poll();
			
			for(int i=1; i<nodes.length; i++) {
				if(visited[i] != 1 && nodes[num][i] == 1) {
					q.offer(i);
					visited[i] = 1;
					count++;
				}
			}
		}
		return count;
	}
	public static void DFS(int[][] network, int[] checked, int n) {
		
		if(checked[n] == 1) return;
		checked[n] = 1;
		cnt++;
	
		for(int i=1; i<network.length; i++) {
			if(checked[i] != 1 && network[n][i] == 1) {
				DFS(network, checked, i);
			}
		}
		
	}
}




