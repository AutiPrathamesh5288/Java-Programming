

import java.util.*;

class QueueDemo{
	public static void main(String[] args){

		PriorityQueue bq = new PriorityQueue();

	/*	pq.offer("Kanha");
		pq.offer("Ashish");
		pq.offer("Rahul");
		pq.offer("Rajesh");
		pq.offer("Badhe");
		System.out.println(pq);*/


		bq.offer(20);
                bq.offer(10);
                bq.offer(30);
                bq.offer(50);
                bq.offer(60);
                bq.offer(40);
                bq.offer(50);
                bq.offer(80);
                bq.offer(70);
                bq.offer(90);
                bq.offer(120);
                bq.offer(89);

/*		System.out.println(pq.poll());
		System.out.println(pq.peek());
		System.out.println(pq.remove());
		System.out.println(pq.contains("Ashish"));


*/		System.out.println(bq);



	}
}

