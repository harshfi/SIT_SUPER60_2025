package Lec1;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		
		int arr1[]= {2,6,9,16};
		int arr2[]= {1,4,5,8,12,13,17,19,20};
		
		int ans[]=mergeArray(arr1,arr2);
		
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
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
