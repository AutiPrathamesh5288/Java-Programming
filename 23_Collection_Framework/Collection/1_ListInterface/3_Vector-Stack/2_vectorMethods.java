import java.util.*;

class VectorDemo{

	public static void main (String[] args){

		Vector v = new Vector();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
		v.addElement(70);
		v.addElement(60);

		System.out.println(v.capacity());
		System.out.println(v.size());

		System.out.println(v.firstElement());
		
		System.out.println(v.lastElement());

		System.out.println(v.elementAt(3));
	}
}






