package day1;
import java.util.*;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int num1= s.nextInt();
		int num2= s.nextInt();
		int num3= s.nextInt();
		int sum =num1+num2+num3;
		System.out.println("sum= "+sum);
		if (sum == 180) {
			if(num1==90 || num2==90 ||num3==90){ 
				System.out.println("price 2");
				System.out.println("it is a right angle triangle");
			}
			else if(num1==num2 && num2==num3 && num3==num1) {
				System.out.println("price 3");
				System.out.println("it is a equalateral triangle");
			}
			else {
				System.out.println("price 1");
				System.out.println("it is a simple triangle");
			}
		}
		else {
			System.out.println("no price");
		}
	}

}
