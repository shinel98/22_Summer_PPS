package pps;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * 백준 1260번 
 */
public class B006_LeeInhyeok_0720 {
	static int[][] NODES;
	static int[] VISITED;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nodes = sc.nextInt();
		int edges = sc.nextInt();
		int start = sc.nextInt();
		int n1,n2;
		NODES = new int[nodes+1][nodes+1];
		VISITED = new int[nodes+1];
		
		for(int i=0; i<edges; i++) {
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			NODES[n1][n2] = 1;
			NODES[n2][n1] = 1;
		}

		DFS(NODES, VISITED, start);
		for(int i=0; i<nodes+1; i++) {
			VISITED[i] = 0;
		}
		System.out.println();
		BFS(start);
		
	}
	public static void DFS(int[][] NODES, int[] VISITED, int start) {
		if(VISITED[start] == 1) return;
		
		VISITED[start] = 1;
		System.out.print(start + " ");
		
		for(int i=1; i<NODES.length; i++) {
			if(VISITED[i] != 1 && NODES[start][i] == 1) {
				DFS(NODES, VISITED, i);
			}
		}
	}
	public static void BFS(int start) {
		Queue<Integer> q = new LinkedList<>();
		int num;
		q.offer(start);
		VISITED[start] = 1;
		System.out.print(start + " ");
		
		while(!q.isEmpty()) {
			num = q.poll();
			
			for(int i=1; i<NODES.length; i++) {
				if(VISITED[i] != 1 && NODES[num][i] == 1) {
					q.offer(i);
					VISITED[i] = 1;
					System.out.print(i + " ");
				}
			}
		}
	}
}
