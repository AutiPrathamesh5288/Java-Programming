import java.util.*;

class GCDemo{

	public static void main(String[] args){

		Demo obj1 = new Demo("Java");
		Demo obj2 = new Demo("CPP");
		Demo obj3 = new Demo("Python");

		WeakHashMap hm = new WeakHashMap();

		hm.put(obj1,2016);
		hm.put(obj2,2019);
		hm.put(obj3,2023);

		obj1 = null;
		System.gc();
		System.out.println(hm);
	}
}





