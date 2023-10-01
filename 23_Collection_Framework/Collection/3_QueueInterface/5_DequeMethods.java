
import java.util.*;

class DequeDemo{

	public static void main(String[] args){

		Deque obj=new ArrayDeque();
		obj.offer(10);
		obj.offer(40);
		obj.offer(20);
		obj.offer(30);

		System.out.println(obj);

		obj.offerFirst(5);
		obj.offerLast(50);

		System.out.println(obj);
	
		System.out.println(obj.size());

		obj.pollFirst();
		obj.pollLast();

		System.out.println(obj);

		obj.peekFirst();
		obj.peekLast();

		System.out.println(obj);

		Iterator itr = obj.iterator();
		while(itr.hasNext()){

			System.out.println(itr.next());
		}

		Iterator itr1 = obj.descendingIterator();
		while(itr1.hasNext()){

			System.out.println(itr1.next());
		}

	


	}
}




