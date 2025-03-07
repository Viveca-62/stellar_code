package day1;

import java.util.Scanner;

public class arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total: " );
		int n=sc.nextInt();
		int arr[]=new int[n]; 
		System.out.println("the total no: "+n);
		for(int i=0;i<n;i++) {
			System.out.println("enter the value: " );
			arr[i]=sc.nextInt();
		}
		boolean[] visited= new boolean[n];
		for(int i=0; i<n;i++) {
			if(visited[i]==true) {
				continue;
			}
			int count=1;
		for (int j=i+1;j<n;j++) {
			if(arr[i] == arr[j]) {
				visited[j]=true;
				count++;
			}
		}
		System.out.println(arr[i]+" "+count);
		}
	}
}
