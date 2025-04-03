package Lec1;

public class mergeSort {

	public static void main(String[] args) {
		int arr[]= {9,4,1,6,2,7};
		
		int ans[]=sort(arr,0,arr.length-1);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}
	public static int[] sort(int arr[],int i,int j) {
		
		if(i==j) {
			int a[]= new int[1];
			a[0]=arr[i];
			return a;
		}
		
		int mid=(i+j)/2;
		
		int a[]=sort(arr,i,mid);
		int b[]=sort(arr,mid+1,j);
		return mergeArray(a,b);
		
	}
	
	public static int[] mergeArray(int arr1[],int arr2[]) {
		int n=arr1.length;
		int m=arr2.length;
		
		int ans[]= new int[n+m];
		int idx=0;
		int i=0;
		int j=0;
		
		while(i<n && j<m) {
			if(arr1[i]<arr2[j]) {
				ans[idx]=arr1[i];
				i++;
			}
			else {
				ans[idx]=arr2[j];
				j++;
			}
			idx++;
		}
		while(i<n) {
			ans[idx]=arr1[i];
			i++;
			idx++;
		}
		while(j<m) {
			ans[idx]=arr2[j];
			j++;
			idx++;
		}
		return ans;
		
	}

	

}
