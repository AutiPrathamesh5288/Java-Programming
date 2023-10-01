import java.util.*;
class ListIteratorDemo{

	public static void main(String[] args){

		List al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add("JAVA");

		ListIterator itr=al.listIterator();
		while(itr.hasNext()){

			System.out.println(itr.next());
		}
		itr.remove();
		System.out.println(itr);
		System.out.println(al);


		while(itr.hasPrevious()){

			System.out.println(itr.previous());
		}
		itr.set(2000);// it replaces the value at iterator reach that particular point

		System.out.println(itr);
		System.out.println(al);

	
	}
}








