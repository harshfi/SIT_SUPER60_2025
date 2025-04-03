package Lec1;

import java.util.Scanner;

public class CF1903a {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			
			int n=sc.nextInt();
			int k=sc.nextInt();
			int arr[]= new int[n];
			boolean sorted =true;
			int prev=0;
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
				if(prev>arr[i])sorted=false;
				prev=arr[i];
			}
			if(k>=2)System.out.println("Yes");
			else if(sorted==true)System.out.println("Yes");
			else System.out.println("No");
		}
		
	}

}
