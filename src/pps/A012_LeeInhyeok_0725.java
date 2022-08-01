package pps;

/*
 * leetcode 204번 
 */
public class A012_LeeInhyeok_0725 {
	

   	public int countPrimes(int n) {
        boolean primenum[] = new boolean[n+1];
    
        for (int i = 0; i< n; i++) {
            primenum[i] = true;
        }
        
        for (int i = 2; i*i < n; i++) {
            if (primenum[i]) {
                for (int j = i*i; j < n; j += i)
                    primenum[j] = false;
            }
        }

        int count = 0;

        
        for (int i = 2; i < n; i++) {
            if (primenum[i])
                count++;
        }
        return count;
    }
	
}
