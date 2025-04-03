package Lec2;

import java.util.Scanner;

public class DormeyPaint {

	public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
		
		int t= sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			
			int arr[]= new int[n];
			
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			
			int first=0;
			int second=0;
			int fc=0;
			int scnt=0;
			
			int third=0;
			
			for (int i = 0; i < arr.length; i++) {
				if(first==0 || first==arr[i]) {
					first=arr[i];
					fc++;
				}
				else if(second==0 || second==arr[i]) {
					second=arr[i];
					scnt++;
				}
				else {
					third=1;
					break;
				}
			}
			
			if(third==1) {
				System.out.println("No");
			}
			else if(second==0) {
				System.out.println("Yes");
			}
			else if(n%2==0 && Math.abs(fc-scnt)==0) {
				System.out.println("Yes");
			}
			else if(n%2==1 && Math.abs(fc-scnt)==1){
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
			
				
		}
	}

}
