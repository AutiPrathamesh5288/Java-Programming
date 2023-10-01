import java.util.*;

class StackDemo{

	public static void main(String[] args){

		Stack st= new Stack();

		st.push(10);
		st.push(30);
		st.push(20);

		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.pop());	
		System.out.println(st.search(20));//in this it starts from '1' not from 0		 
		System.out.println(st.search(10));

		System.out.println(st.empty());
		
		System.out.println(st);

		Iterator itr=st.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}

