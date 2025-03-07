package day1;
import java.util.*;
public class d2_arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1=0;
		int sum2=0;
		int sum3=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for (int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>= j) {
					sum1= sum1 +arr[i][j];
				}
				if(i== j) {
					sum2= sum2 +arr[i][j];
				}
				if(i<= j) {
					sum3= sum3 +arr[i][j];
				}
				System.out.print(arr[i][j]);
				
				}
			    System.out.println();
			}
		System.out.println("sum of lower tri:"+sum1);
		System.out.println("sum of dia tri:"+sum2);
		System.out.println("sum of upper tri:"+sum3);
		}
	}


