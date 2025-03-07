package day1;

import java.util.Scanner;

public class day1_program1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int ml=s.nextInt();
		int nl=s.nextInt();
		int x=s.nextInt();
		int y=s.nextInt();
		int m2=m+ml;
		int n2=n+nl;
		int totalnoofapples=m+m2;
		int totalnooforanges=n+n2;
		int remainingapples=totalnoofapples-x;
		int remaingoranges=remainingapples-y;
		System.out.println(remainingapples);
		System.out.println(remaingoranges);
		
	}

}
