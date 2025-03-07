package day1;
import java.util.*;

public class str1_email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String email=sc.nextLine();
		System.out.println(email);
		if(email.contains("com") || email.contains("net")||email.contains("in")|| email.contains("org"))
		{
			System.out.println("valid");
		} 
		else {
			System.out.println("not valid");
		}
	}

} 
