import java.util.*;
class EnumIterator {

	public static void main(String []args){
		
		Vector v = new Vector();
		v.add(10);
		v.add("JAVA");
		v.add('k');
		System.out.println(v);

		Enumeration cursor = v.elements();
		System.out.println(cursor);

		System.out.println(cursor.getClass().getName());

		while(cursor.hasMoreElements()){

			System.out.println(cursor.nextElement());
		}

	}
}

	        	

