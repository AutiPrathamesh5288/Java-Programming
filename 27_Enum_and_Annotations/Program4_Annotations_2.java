//2 Suppress Warnings;-it is used for removing waning in the collection used without generics

import java.util.*;

class TestAnnotation2{
	@SuppressWarnings("unchecked")
	public static void main(String args[]){
	ArrayList list=new ArrayList();
	list.add("sonoo");
	list.add("vimal");
	list.add("ratan");

	for(Object obj:list)
	System.out.println(obj);
	}
}
