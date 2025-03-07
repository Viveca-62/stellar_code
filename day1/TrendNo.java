package day1;
import java.util.*;
public class TrendNo {

	public static void main(String[] args) {

				Scanner s=new Scanner(System.in);
				int n=s.nextInt();
				int m=n/10;
				int mid=m%10;
				if(mid%3 == 0) {
					System.out.println(n+" is a trendy number");
				}
				else {
					System.out.println(n+" is not a trendy number");
				}
			}

		
	}


