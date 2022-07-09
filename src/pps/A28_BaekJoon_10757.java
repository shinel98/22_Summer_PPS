package pps;

import java.math.BigInteger;
import java.util.Scanner;

public class A28_BaekJoon_10757 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		BigInteger x = new BigInteger(sc.next());
		BigInteger y = new BigInteger(sc.next());
		
		x = x.add(y);
		System.out.println(x);
	}

}
