package pps;

/*
 * 백준 17210번 
 */
import java.util.Scanner;

public class A029_LeeInhyeok_0726 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    
	    int num = sc.nextInt();
	    int first = sc.nextInt();
	    
	    if(num > 5) {
	    	System.out.println("Love is open door");
	    } 
	    else {
	    	for(int i=0; i < num-1; i++){
				if(first == 0) {
		            System.out.println("1");
		            first = 1;
				}
				else {
					System.out.println("0");
					first = 0;
				}
		    } 
		}
	   
	}

}
