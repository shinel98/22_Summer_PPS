package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A104_LeeInhyeok_0722 {
	public static void main(String[] args) throws IOException {
		int islandCnt;
		int maxCost = 0;
		int result = 0;
		int[] Costs;
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		islandCnt = Integer.parseInt(bf.readLine());
		
		Costs = new int[islandCnt];

		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		for(int i = 0; i < islandCnt; i++) {
			Costs[i] = Integer.parseInt(st.nextToken());
			result += Costs[i];
			
			if(maxCost == 0) {
				maxCost = Costs[i];
			} else if(maxCost < Costs[i]) {
				maxCost = Costs[i];
			}
		}
		result -= maxCost;
		System.out.println(result);
	}
}