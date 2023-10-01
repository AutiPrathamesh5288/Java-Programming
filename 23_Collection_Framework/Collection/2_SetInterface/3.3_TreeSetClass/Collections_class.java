import java.util.*;

class SortDemo{
	public static void main(String[] args){

		ArrayList al = new ArrayList();
		al.add("Kanha");
		al.add("Ashish");
		al.add("Rahul");
		al.add("Shashi");
		al.add("Kanha");

		System.out.println(al);

		Collections.sort(al);

		System.out.println(al);

	}
}





