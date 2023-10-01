import java.util.*;

class Demo {

	public static void main(String[] args){

		SortedMap sm = new TreeMap();

		sm.put("Ind","India");
		sm.put("Pak","Pakistan");
		sm.put("Np","Nepal");
		sm.put("US","United States");
		sm.put("CH","China");

		System.out.println(sm);

		Set<Map.Entry> data = sm.entrySet();
		Iterator <Map.Entry> itr = data.iterator();

		while(itr.hasNext()){

			Map.Entry abc = itr.next();
			System.out.println(abc.getKey()+":"+abc.getValue());
		}
	}
}

