package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준 5355번 
 */
public class A35_LeeInhyeok_0712 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		
		for(int i=0; i<N; i++) {
			String[] inputLine = bf.readLine().split(" ");
			double num = Double.parseDouble(inputLine[0]);
			for(int j=1; j<inputLine.length; j++) {			
				switch(inputLine[j]) {
				case "@":
						num *= 3;
						break;
				case "%":
						num += 5;
						break;
				case "#":
						num -= 7;
				}
			}
			System.out.printf("%.2f\n", num);
		}
	}

}
