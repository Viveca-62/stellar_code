package day1;
import java.util.*;

public class lucas {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int total= s.nextInt();
		int n1= s.nextInt();
		int n2= s.nextInt();
		int n3= s.nextInt();
		int i=0;
		
		for(i=0;i<total;i++) {
			int n4=n1+n2+n3;
			n1=n2;
			n2=n3;
			n3=n4;
			System.out.println(n4);
		}
		
	}
}
