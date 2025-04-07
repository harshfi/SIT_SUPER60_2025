package Lec5;

public class BinarySerach {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,3,3,3,5};
		int []ans=searchRange(arr,3);
		System.out.println(ans[0]+" "+ans[1]);
		

	}
	
   public static int[] searchRange(int[] nums, int target) {
        int i=StartIndex(nums,target);
        int j=EndIndex(nums,target);
        return new int[] {i,j};
    }
   public static int EndIndex(int [] arr,int target) {
	   int i=0;
	   int j=arr.length-1;
	   int ans=-1;
	   while(i<=j) {
		   int m=(i+j)/2;
		   if(arr[m]==target) {
			  ans=m;
			  i=m+1;
		   }
		   else if(target>arr[m])i=m+1;
		   
		   else j=m-1;
	   }
	   return ans;
   }
   public static int StartIndex(int [] arr,int target) {
	   int i=0;
	   int j=arr.length-1;
	   int ans=-1;
	   while(i<=j) {
		   int m=(i+j)/2;
		   if(arr[m]==target) {
			  ans=m;
			  j=m-1;
		   }
		   else if(target>arr[m])i=m+1;
		   
		   else j=m-1;
	   }
	   return ans;
   }

}
