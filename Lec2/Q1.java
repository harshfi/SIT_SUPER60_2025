package Lec2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int t= sc.nextInt();
		
		while(t-->0) {
			int n=sc.nextInt();
			System.out.println(n%3==0?"Second":"First");
				
		}

	}

}
