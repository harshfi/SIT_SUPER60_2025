package Lec1;

import java.util.Scanner;

public class CF1896a {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			
			int n=sc.nextInt();
			boolean check=false;
			for (int i = 0; i < n; i++) {
				int num=sc.nextInt();
				if(i==0 && num==1)check=true;
			}
			System.out.println(check==true?"Yes":"No");
			
		}

	}

}
