package Lec4;

import java.util.Stack;

public class NGE {

	public static void main(String[] args) {
		
		int arr[]= {6,3,8,1,5,4,6,7,-1,2};
		Stack<Integer> st= new Stack<>();
		
		int ans[]= new int [arr.length];
		
for (int i = 0; i < ans.length; i++) {
			
			while(!st.isEmpty() && arr[st.peek()]<arr[i]) {
				int idx=st.pop();
				ans[idx]=arr[i];
			}
			st.push(i);
		}

		while(!st.isEmpty()) {
			int idx=st.pop();
			ans[idx]=-1;
		}
		
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}

	}

}
