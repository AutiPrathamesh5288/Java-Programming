import java.util.*;

class IteratorDemo{
	public static void main(String[] args){

		ArrayList al =new ArrayList();
		al.add("Ashish");
		al.add("Rahul");
		al.add("Shashi");

		Iterator itr = al.iterator();
		while(itr.hasNext()){

			if("Rahul".equals(itr.next())){
				itr.remove(); // 
			}
			System.out.println(itr.next());
		}

		System.out.println(al);
	}
}

/*
Rahul
Exception in thread "main" java.util.NoSuchElementException
	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:970)
	at IteratorDemo.main(Program4.java:17)
*/
