package day1;

import java.util.*;

public class luckywinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a%10 == 3 || a%10==8) {
			System.out.println("lucky winner");
		}
		else {
			System.out.println("better luck next time");
		}
	}

}
