package pps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/*
 * 백준 1431번 
 */
public class A085_LeeInhyeok_0720 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		// TODO Auto-generated method stub
//		A와 B의 길이가 다르면, 짧은 것이 먼저 온다.
//		만약 서로 길이가 같다면, A의 모든 자리수의 합과 B의 모든 자리수의 합을 비교해서 작은 합을 가지는 것이 먼저온다. (숫자인 것만 더한다)
//		만약 1,2번 둘 조건으로도 비교할 수 없으면, 사전순으로 비교한다. 숫자가 알파벳보다 사전순으로 작다.
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		String[] inputs = new String[N];
		
		
		for(int i=0; i<N; i++) {
			inputs[i] = bf.readLine();
		}
		
		Arrays.sort(inputs, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				int total1 = 0;
				int total2 = 0;
				// TODO Auto-generated method stub
				if(s1.length()<s2.length()) {
					return -1;
				}else if(s1.length() == s2.length()) {
					for(int i=0; i<s1.length(); i++) {
						if(s1.charAt(i)>='0' && s1.charAt(i)<='9') {
							total1 += s1.charAt(i) - '0';
						}	
					}
					for(int i=0; i<s2.length(); i++) {
						if(s2.charAt(i)>='0' && s2.charAt(i)<='9') {
							total2 += s2.charAt(i) - '0';
						}	
					}
					if(total1 == total2) {
						return s1.compareTo(s2);	
					}else {
						return Integer.compare(total1, total2);
					}
				}
				else {
					return 1;
				}
			}
		});
		for(int i=0; i<N; i++) {
			System.out.println(inputs[i]);
		}
	}
	
}
