package pps;


/*
 * 백준 2217 번 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A125_LeeInhyeok_0725 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int count = Integer.parseInt(st.nextToken());
        int arr[] = new int[count];
        
        for(int i=0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        
        long max = 0;
        for(int i = count-1; i >= 0; i--) {
            arr[i] = arr[i] * (count-i);
            if(max < arr[i]) max = arr[i];
        }
        System.out.println(max);
	}

}

