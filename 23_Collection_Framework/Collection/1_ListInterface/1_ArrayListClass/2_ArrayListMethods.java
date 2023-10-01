import java.util.*;
class ArrayListDemo extends ArrayList{

        public static void main(String[] args){

                ArrayListDemo al=new ArrayListDemo();

		al.ensureCapacity(4);
		//1.void add(E(Element))
                al.add(10);
                al.add(79.90);
                al.add("Core2web");
                al.add(76.87f);
                al.add('k');
                

		//2.void add(int,E) it add element in the left side of that index term
		al.add(3,"Incubator");
		System.out.println(al);

		//3. int size() it give size of arraylist
		System.out.println(al.size());

		//4. boolean contains(Object) it find value is it present in that list or not
		System.out.println(al.contains("Jaguar"));  //false
		System.out.println(al.contains(10));        //true
		

		//5. int indexOf(Object) it gives index of particular element else element not then '-1'
		
		System.out.println(al.indexOf("Jagur"));  
		System.out.println(al.indexOf(10));       

		//6. int lastIndexOf(object) //it gives last index of that term

		System.out.println(al.lastIndexOf("Jaguar"));  
		System.out.println(al.lastIndexOf(10));    

		//7. E get (int)

		System.out.println(al.get(3));

		//8 E set (int)it will set or replace value instead of that particular index 

		System.out.println(al.set(3,"JAVA"));
		System.out.println(al);

		//9. boolean addAll(collection) it adds all data in one time of another collection object
		
		ArrayList obj=new ArrayList();
		obj.add(79.90);
                obj.add("Core2web");
                obj.add(76.87f);
                obj.add('k');

		System.out.println(al.addAll(obj));
		System.out.println(al);

		//10. boolean addAll(int,collection) it adds all data in one time of another collection object at the given index

                
                obj.add(79.90);
                obj.add("Core2web");
                obj.add(76.87f);
                obj.add('k');

                System.out.println(al.addAll(1,obj));
                System.out.println(al);

		//11. toArray  it convert it into array
		Object arr[]=al.toArray();
		for(Object data:arr){

			System.out.print(data+" ");
		}
		System.out.println();

		//12. E remove(int)

		System.out.println(al.remove(1));
		System.out.println(al);

		//13. protected void removeRange(int,int)   so here protected so need to be parent child relationship

		al.removeRange(1,3);
		System.out.println(al);

		//14. void clear() 

		al.clear();
		System.out.println(al);

		



	}
}
