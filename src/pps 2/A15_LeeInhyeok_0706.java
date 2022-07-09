			package pps;
			
			import java.io.BufferedReader;
			import java.io.IOException;
			import java.io.InputStreamReader;
			import java.util.StringTokenizer;
			
			public class A15_LeeInhyeok_0706 {
				public static void main(String[] args) throws IOException  {
					
					BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
					
					String[] arr = bf.readLine().split(" ");
					
					int total = 0;
					
					for(int i=0; i<arr.length; i++) {
						total += (int) Math.pow(Integer.parseInt(arr[i]), 2);
					}
					int num = total%10;
					System.out.println(num);
				
				}
			}
