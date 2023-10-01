import java.util.*;
class IteratorDemo{

	public static void main(String[] args){

		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(20);
		al.add("JAVA");
		al.add("PYTHON");



		System.out.println(al);

		Iterator itr = al.iterator();

		while(itr.hasNext()){

			System.out.println(itr.next());
		}

		itr.remove();
		System.out.println(al);
		System.out.println(itr);


	}												
}
