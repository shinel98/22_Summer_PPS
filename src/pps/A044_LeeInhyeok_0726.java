package pps;
/*
 * leetcode 551번 
 */
public class A044_LeeInhyeok_0726 {
	public boolean checkRecord(String s) {
        if(s.indexOf("LLL") != -1){
            return false;
        }
        int n = s.length();
        int cntA = 0;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == 'A') {
                cntA++;
                if(cntA > 1) {
                    return false;
                }
            }
        }
        return true;
    }

}
