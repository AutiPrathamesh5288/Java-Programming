

import java.util.*;

class QueueDemo{
	public static void main(String[] args){

		PriorityQueue pq = new PriorityQueue();


		pq.add(40);
		pq.add(50);
		pq.add(20);
		pq.add(30);
		pq.add(80);
		
		System.out.println(pq);
	}
}
		/*Output:
		 

		  [20, 30, 40, 50, 80]

		  */
