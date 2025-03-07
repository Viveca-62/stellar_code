package day1;
import java.util.*;
public class array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];
		a=new int[5];
		int sum=0;
		int product=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=s.nextInt();
		for(int i=0; i<n;i++) {
			System.out.println("enter the element");
			a[i]=s.nextInt();
		}
		for(int i=0; i<n;i++) {
			System.out.println("value of the "+i+" are : "+a[i]);
			sum=sum+a[i];
			product= product * a[i];
		}
		System.out.println("sum is: "+ sum);
		System.out.println("product is: "+ product);
	}
}