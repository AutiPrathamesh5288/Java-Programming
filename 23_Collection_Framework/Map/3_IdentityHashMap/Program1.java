import java.util.*;

class IdentityHashMap {

	public static void main(String[] args){

		IdentityHashMap hm = new IdentityHashMap();
/*
		hm.put(new Integer(10),"Kanha");
		hm.put(new Integer(10),"Rahul");
		hm.put(new Integer(10),"Badhe");
*/
		hm.put(10,"Kanha");
                hm.put(10,"Rahul");
                hm.put(10,"Badhe");

		System.out.println(hm);
	}
}



