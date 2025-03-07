package day1;
import java.util.*;
public class d2_arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int sq=0;
		int sum=0;
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for( int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					sq=arr[i][j]*arr[i][j];
					sum=sum+sq;
				}
			}
			System.out.print(sum);
		}
	}

}
