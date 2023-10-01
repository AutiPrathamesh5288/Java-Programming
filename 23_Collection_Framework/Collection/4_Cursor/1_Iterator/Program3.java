import java.util.*;
class Demo{
	public static void main(String []aargs){

		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add("JAVA");
		al.add('K');



		for (var x:al){       //in this var keyword comes at version 10 of java 
			System.out.println(x.getClass().getName());
		}
	}
}

