import java.util.*;

class TreeSetDemo {

	public static void main(String[] args){

		SortedMap sm = new TreeMap();
		sm.put("Ind","India");
		sm.put("Pak","Pakistan");
		sm.put("Np","Nepal");
		sm.put("US","United States");
		sm.put("CH","China");

		System.out.println(sm);

		System.out.println(sm.subMap("CH","Pak")); //give values of map after sorting
		System.out.println(sm.headMap("Pak")); //give values of map after sorting
		System.out.println(sm.tailMap("Pak")); //give values of map after sorting
		System.out.println(sm.firstKey()); //give values of map after sorting
		System.out.println(sm.lastKey()); //give values of map after sorting
		System.out.println(sm.keySet()); //give values of map after sorting
		System.out.println(sm.values()); //give values of map after sorting
		System.out.println(sm.entrySet()); //give values of map after sorting

	}
}
		
		
		
		
		
	
