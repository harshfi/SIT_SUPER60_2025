package Lec3;

public class DyanmicStack extends Stack {

	@Override
	public void push(int ele) throws Exception {
		if(isFull()) {
			int newarr[]=new int[2*arr.length];
			for (int i = 0; i < arr.length; i++) {
				newarr[i]=arr[i];
			}
			arr=newarr;
		}
		
		super.push(ele);
	}
	
}
