import java.util.concurrent.*;

class BlockingQueueDemo{
	public static void main(String []args)throws InterruptedException{

		BlockingQueue bq = new PriorityBlockingQueue(3);

		bq.offer(10);
		bq.offer(20);
		bq.offer(10);

		System.out.println(bq);
		bq.add(40);

		System.out.println(bq);
	}
}




