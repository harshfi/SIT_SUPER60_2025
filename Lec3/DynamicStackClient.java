package Lec3;

public class DynamicStackClient {

	public static void main(String[] args)throws Exception {
		
		DyanmicStack ds= new DyanmicStack();
		
		ds.push(1);
		ds.push(2);
		ds.push(5);
		ds.push(7);
		ds.push(13);
		ds.push(3);
		ds.Display();
		
		ds.pop();
		ds.pop();
		ds.Display();
		
		

	}

}
