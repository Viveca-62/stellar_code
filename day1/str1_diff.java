package day1;
import java.util.*;

public class str1_diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String s3= s1.toLowerCase();
		String s4= s2.toLowerCase();
		char ch1[]=s3.toCharArray();
		char ch2[]=s4.toCharArray();
		int result=0;
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]!= ch2[i]) {
				result=(int)ch1[i]-(int)ch2[i];
				break;
			}
		}
		System.out.println(result);
	}
}
