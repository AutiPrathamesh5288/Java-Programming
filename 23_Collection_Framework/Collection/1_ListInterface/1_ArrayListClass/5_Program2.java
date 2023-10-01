import java.util.*;

class Demo {

	public static void main(String [] args){

		ArrayList al = new ArrayList();
		for(int i=1;i<=20;i++){
			al.add(i);
		}
		System.out.println(al);

		ArrayList al1=new ArrayList();
		for(int i=21;i<=40;i++){
			al1.add(i);
		}
		al.addAll(al1);
		System.out.println(al);
	}
}


