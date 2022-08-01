package pps;

/*
 * leetcode 1704번 
 */
public class A040_LeeInhyeok_0726 {
	public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int length = s.length();
        
        int half = length / 2;
        int vowels1 = 0, vowels2 = 0;
        
        for (int i = 0; i < half; i++) {
            char c1=s.charAt(i), c2=s.charAt(i + half);
            
            if (isVowel(c1))
                vowels1++;
            if (isVowel(c2))
                vowels2++;
        }
        return vowels1 == vowels2;
    }

    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
