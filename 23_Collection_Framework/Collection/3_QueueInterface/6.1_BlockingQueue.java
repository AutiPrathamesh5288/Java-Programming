import java.util.concurrent.*;

class BlockingQueueDemo{
        public static void main(String []args)throws InterruptedException{

                
		BlockingQueue bq = new PriorityBlockingQueue(3);

                bq.put(40);
                bq.put(50);
                bq.put(20);
                bq.put(30);
                bq.put(80);

                System.out.println(bq);

                
            }
}
	/* Output :
	 
	   [20, 30, 40, 50, 80]

	   */
