import java.util.concurrent.*;

class PriorityBlockingQueueDemo{

	public static void main(String[] args)throws InterruptedException{

		BlockingQueue pb=new PriorityBlockingQueue(3);
		pb.put("B");
		pb.put("c");
		pb.put("D");
		pb.put("Z");
		pb.put("A");
		System.out.println(pb);
	}
}



