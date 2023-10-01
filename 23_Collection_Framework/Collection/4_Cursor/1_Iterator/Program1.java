import java.util.*;
class IteratorDemo{

	public static void main(String[] args){

		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(20);
		al.add("JAVA");
		al.add("PYTHON");
		al.add('K');
		al.add(525.65);

		System.out.println(al);

		Iterator itr = al.iterator();
		itr.remove();         //Exception throws because of this..
		while(itr.hasNext()){

			System.out.println(itr.next());
		}


	}
}
