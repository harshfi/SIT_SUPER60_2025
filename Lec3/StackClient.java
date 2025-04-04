package Lec3;

public class StackClient {

	public static void main(String[] args) throws Exception {
		
		Stack st= new Stack();
//		st.pop();
//		st.push(1);
//		st.push(5);
//		st.push(6);
//		st.push(7);
//		st.push(9);
//		st.Display();
//		st.pop();
//		st.Display();
//		st.push(1);
//		st.push(5);
		
		st.push(1);
		st.push(5);
		st.push(6);
		st.push(9);
		st.pop();
		st.pop();
		System.out.println(st.peek());
		System.out.println(st.isEmpty());
		
		
		
		
		

	}

}
