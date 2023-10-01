


import java.util.*;
class QueueDemo{
	public static void main(String [] args){

		Queue  que=new LinkedList();
		que.offer(10);
		que.offer(30);      //1
		que.add(20);        //2
		que.offer(50);
		que.offer(40);

		System.out.println(que);

		System.out.println(que.poll());          //3
		System.out.println(que.remove());        //4
		
		System.out.println(que.size());

		System.out.println(que.peek());         //5
		System.out.println(que.element());      //6
		System.out.println(que);

		//difference between peek and element is "element is throws nosuchelement exception if nothing value is given"
		//Also same like poll and remove
		//
		//means if we not offer any value then peek and poll gives null  but for remove and element it gives "nosuchelementException"






	}
}





