import java.util.*;

class Demo{
	public static void main(String[] args){

		HashMap hm =new HashMap();

		hm.put("Java",".java");
		
		hm.put("Python",".py");
		
		hm.put("C",".c");
		
		hm.put("C++",".cpp");

		System.out.println(hm);

		System.out.println(hm.get("Python"));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());




	}
}
		
