import java.util.*;


class VectorDemo {

	public static void main(String [] args){

		Vector v=new Vector();
		v.addElement(10);
		v.add(103);
		v.add("45");

		System.out.println(v);
		System.out.println(v.capacity());

		//Iterator itr=v.iterator();
		ListIterator itr = v.listIterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	

		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}


		Enumeration enu=v.elements();
		while(enu.hasMoreElements()){
			System.out.println(enu.nextElement());
		}
	}
}
