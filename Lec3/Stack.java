package Lec3;

public class Stack {

	protected int arr[];
	private int top;
	
	public Stack(int cap) {
		arr=new int[cap];
		top=0;
	}
	public Stack() {
		arr=new int[5];
		top=0;
	}
	
	public boolean isEmpty() {
		return top==0;
	}
	
	public boolean isFull() {
		return top==arr.length;
	}
	
	public int size() {
		return top;
	}
	
	public void push(int ele) throws Exception {
		if(isFull()) {
			throw new Exception("Boka full hain");
		}
		
		arr[top]=ele;
		top++;
	}
	
	public int pop()throws Exception{
		if(isEmpty()) {
			 throw new Exception("Boka kali hain");
		}
		
		int ele=arr[top-1];
		top--;
		return ele;
	}
	public int peek()throws Exception{
		if(isEmpty()) throw new Exception("Boka kali hain rrreeee");
		
		return arr[top-1];
	}
	public void Display() {
		for (int i = 0; i < top; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
}
