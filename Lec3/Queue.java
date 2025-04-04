package Lec3;

public class Queue {

private int arr[];
private	int front;
private	int size;
	
	public Queue(int cap) {
		arr=new int [cap];
		front=0;
		size=0;
	}
	
	public Queue() {
		arr=new int [5];
		front=0;
		size=0;
	}
	
	public boolean isEmpty() {
	return size==0;
	}
	
	public boolean isfull() {
		return size==arr.length;
	}
	
	public int size() {
		return size;
	}
	
	public void Enqueue(int ele)throws Exception{
		
		if(isfull())throw new Exception("pagal admi arr full hain");
		
		int idx=(front+size)%arr.length;
		
		arr[idx]=ele;
		size++;
		
	}
	public int Dequeue()throws Exception{
		
		if(isEmpty())throw new Exception("Kali hain jaise ki ap ka demag bhaiya");
		
		int ele=arr[front];
		front=(front+1)%arr.length;
		size--;
		return ele;
		
	}
	
	public int GetFront()throws Exception{
		if(isEmpty())throw new Exception("becuf bacha kafi hain ");
		
		return arr[front];
	}
	
	public void Display() {
		for (int i = 0; i < size; i++) {
			int idx=(front+i)%arr.length;
			System.out.print(arr[idx]+" ");
		}
		System.out.println();
	}
	

}
