package Lec2;

import java.util.Random;

public class RandomizedQuickSort {

	public static void main(String[] args) {
		
		int arr[]= {8,3,1,2,4,6,5};
		sort(arr,0,arr.length-1);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void sort(int arr[], int si, int ei) {
		
		if(si>ei) return;
		
		int pi=pivot(arr,si,ei);
		
		sort(arr,si,pi-1);//left
		sort(arr,pi+1,ei);//right
		    
	}
public static int pivot (int arr[], int si, int ei) {
		Random r=new Random();
		int x= r.nextInt(ei-si+1)+si;
		
		int tt=arr[x];
		arr[x]=arr[ei];
		arr[ei]=tt;
		
		int element=arr[ei];
		int pi=si;
		
		for(int i=si;i<=ei;i++) {
			if(element> arr[i]) {
				int temp=arr[i];
				arr[i]=arr[pi];
				arr[pi]=temp;
				pi++;
			}
		}
		
		int temp=arr[ei];
		arr[ei]=arr[pi];
		arr[pi]=temp;
		return pi;
	}
}
