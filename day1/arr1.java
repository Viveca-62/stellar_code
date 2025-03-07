package day1;
import java.util.*;
public class arr1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total: " );
		int n=sc.nextInt();
		int arr[]=new int[n];
		int min=0;
		int max=0;
		System.out.println("the total no: "+n);
		for(int i=0;i<n;i++) {
			System.out.println("enter the value: " );
			arr[i]=sc.nextInt();
		}
		min=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("min value is"+ min);
		max=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("max value is"+ max);
	}
}
