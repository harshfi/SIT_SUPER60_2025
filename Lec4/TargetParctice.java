package Lec4;

import java.util.Scanner;

public class TargetParctice {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			
			String s[]= new String [10];
			for (int i = 0; i < s.length; i++) {
				s[i]=sc.next();
			}
			int tt=0;
			
			for (int i = 1; i <=10 ; i++) {
				for (int j = 1; j <=10; j++) {
					
					if(s[i-1].charAt(j-1)=='X') {
						
						int p1=i<=5?i:10-i+1;
						int p2=j<=5?j:10-j+1;
						
						int p=Math.min(p1, p2);
						tt=tt+p;
					}
				}
			}
			System.out.println(tt);
			
		}

	}

}
