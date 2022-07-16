package pps;

import java.util.Scanner;

public class A049_LeeInhyeok_0714 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			String pw = sc.next(); 
			if(pw.equals("end"))
				break;
			int check = 0;
			char[] pw_array = pw.toCharArray();
			char[] overlap = pw.toCharArray();
			
				
			for(int i=0; i<pw.length(); i++) {
				overlap[i] = '0';
			}
			
			
			int j=0;
			for(char p : pw_array) {
				switch(p) {
				case 'a': 
				case 'e':
				case 'i': 
				case 'o':
				case 'u': 
					check = 1;
					overlap[j] = '1';
				} 
				j++;
			}
			for(int i=0; i<pw.length(); i++) {
				if(i+2 < pw.length()) { 
					if(overlap[i] == overlap[i+1] && overlap[i+1]== overlap[i+2]) 
						check = 0;
				}
			}
			
			
		    for(int i=0; i<pw.length(); i++) {
		    	if(i+1 < pw.length()) {
		    		if(pw_array[i] == pw_array[i+1]) {
		    			if(pw_array[i] == 'e' || pw_array[i] == 'o') {
		    				check = 1;
		    			}
		    			else 
		    				check = 0;
		    		}
		    	}
		    }
		    
		    if(check == 1)
				System.out.println("<" + pw + ">" + " is acceptable.");
			else
				System.out.println("<" + pw + ">" + " is not acceptable.");			
		}
		
	}
}



