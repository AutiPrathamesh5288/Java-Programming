import java.util.*;
class MyClass implements Comparable{

	String name = null;

	MyClass(String name) {

		this.name=name;

	}

	public int compareTo(Object obj) {

		return ((name).compareTo(((MyClass)obj).name));
	}

	public String toString() {

		return name;
	}

}
class TreeSetDemo{

	public static void main (String[] args){

		TreeSet ts = new TreeSet();
		ts.add(new MyClass("Shashi"));
		ts.add(new MyClass("Ashish"));
		ts.add(new MyClass("Ram"));
		ts.add(new MyClass("Lakshaman"));

		System.out.println(ts);
	}
}



