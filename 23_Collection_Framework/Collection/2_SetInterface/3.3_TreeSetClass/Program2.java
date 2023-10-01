import java.util.*;
class TreeSetDemo{
	public static void main(String[] args){

		TreeSet ts=new TreeSet();	

		ts.add("java");
		System.out.println((int)('j'));
		System.out.println("j".hashCode());
		ts.add("pYTHON");	
		ts.add("pYTHON");	
		System.out.println((int)('p'));
		ts.add("pYTHON");
		ts.add("NOTEBOOK");
		ts.add("oop");

		// it check by ascii value not by alphabetical order
	
	

		System.out.println(ts);
	}
}
