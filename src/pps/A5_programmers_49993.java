package pps;

import java.util.Collections;

public class A5_programmers_49993 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		Solution5 sol = new Solution5();
		System.out.println(sol.solution(skill, skill_trees));
	}

}

class Solution5 {
    public int solution(String skill, String[] skill_trees) {
       int answer = 0;
       String sub_skill;
       
        
       for(int i=0; i<skill_trees.length; i++) {
    	   StringBuilder sb = new StringBuilder();
    	   
    	   for(int j=0; j<skill_trees[i].length(); j++) {
    		   if(skill.contains(String.valueOf(skill_trees[i].charAt(j)))){
    			   sb.append(skill_trees[i].charAt(j));
    		   }
    	   }
    	   for(int j=skill.length(); j>-1; j--) {
    		   sub_skill = skill.substring(0, j);
    		   if(sub_skill.equals(sb.toString())) {
    			   answer++;
    			   break;
    		   }   	
    	   }
       }
       return answer;
    }
}