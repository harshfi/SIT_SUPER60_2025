package Lec3;

public class QueueClient {

	public static void main(String[] args) throws Exception {
		
		Queue q= new Queue(4);
		
		q.Enqueue(5);
		q.Enqueue(7);
		
		System.out.println(q.size());
		
		q.Display();
		
		q.Dequeue();
		q.Display();
		q.Enqueue(8);
		q.Enqueue(5);
		q.Enqueue(7);
		
		System.out.println(q.isfull());
		
//		q.Enqueue(5);
//		System.out.println(q.arr[2]);  
		
		
		

	}

}
