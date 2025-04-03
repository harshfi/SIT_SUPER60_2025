package Lec1;
import java.util.*;
public class CF19001a {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			
			int n=sc.nextInt();
			int x=sc.nextInt();
			int arr[]= new int[n];
			for (int i = 0; i < n; i++) {
				arr[i]=sc.nextInt();
			}
			int max=0;
			int prev=0;
			
			for (int i = 0; i < arr.length; i++) {
				max=Math.max(max, arr[i]-prev);
				prev=arr[i];
			}
			
			max=Math.max(max, 2*(x-prev));
			System.out.println(max);
			
		}

	}

}
