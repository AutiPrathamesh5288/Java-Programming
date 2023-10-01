import java.util.*;

class SortedSetDemo{

	public static void main(String[] args){

		SortedSet ss = new TreeSet();
		ss.add("Kanha");
		ss.add("Shashi");
		ss.add("Rahul");
		ss.add("Jaguar");	
		ss.add("Jaguar");

		System.out.println(ss);
		System.out.println(ss.subSet("Jaguar","Kanha"));
		System.out.println(ss.headSet("Kanha"));
		System.out.println(ss.tailSet("Kanha"));
		System.out.println(ss.first());
		System.out.println(ss.last());





	}
}



