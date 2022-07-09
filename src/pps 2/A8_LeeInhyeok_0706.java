package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A8_LeeInhyeok_0706 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(bf.readLine());
		
		for(int i=0; i<N; i++) {	
			
			st = new StringTokenizer(bf.readLine()," ");
			
			int students = Integer.parseInt(st.nextToken());
			double total = 0;
			double average;
			double count = 0;
			int[] scores = new int[students];
			
			for(int j=0; j<students; j++) {
				scores[j] = Integer.parseInt(st.nextToken());
				total += scores[j];
			}
			
			average = total/students;
			
			for(int j=0; j<students; j++) 
				if(scores[j] > average) 	
					count++;
				
			System.out.printf("%.3f%%\n", count/students * 100);
		
			
		}
	}

}
