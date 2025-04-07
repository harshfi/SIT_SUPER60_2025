package Lec5;
import java.util.*;
public class Leetcode1 {

	public static void main(String[] args) {
		

	}
	
	  public int minimumPairRemoval(int[] nums) {
	       
		  List<Integer> l= new ArrayList<>();
		  
		  for (int i = 0; i < nums.length; i++) l.add(nums[i]);
		  int cnt=0;
		  while(isSorted(l)==false) {
			  int min=Integer.MAX_VALUE;
			  int idx=-1;
			  for (int i = 0; i < l.size()-1; i++) {
				if(l.get(i)+l.get(i+1)<min) {
					min=l.get(i)+l.get(i+1);
					idx=i;
				}
			}
			 List<Integer> ll= new ArrayList<>();
			 
			 for(int i=0;i<l.size();i++) {
				 if(idx==i) {
					 ll.add(min);
					 i++;
				 }
				 else ll.add(l.get(i));
			 }
			 l=ll;
			 cnt++;
			  
		  }
		  return cnt;
		  
	    }
	  
	  public static boolean isSorted(List<Integer> l) {
		  
		  for(int i=0;i<l.size()-1;i++) {
			  if(l.get(i)>l.get(i+1)) {
				  return false;
			  }
		  }
		  
		  return true;
		  
	  }

}
