import java.util.*;

class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<var> al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add("JAVA");


		for(var data : al) {
		
			System.out.println(data);
		}
	}
}
