import java.util.*;

class Employee{

	String empName;
	int sal;

	Employee(String empName,int sal){
		this.empName=empName;
		this.sal=sal;
	}
	public String toString(){
		return empName + ":"+sal;
	}
}
	class SortByName implements Comparator{

		public int compare(Object obj1,Object obj2){
			return (((Employee)obj1).empName).compareTo(((Employee)obj2).empName);
		}
	}
	class SortBySal implements Comparator{
		
		public int compare(Object obj1,Object obj2){
			return (((Employee)obj1).sal)-(((Employee)obj2).sal);
		}
	}

class ListSortDemo{
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		al.add(new Employee("Kanha",20000));
		al.add(new Employee("Rajesh",1000));
		al.add(new Employee("Sathe",25000));
		al.add(new Employee("Sarsawati",3000));

		System.out.println(al);
		Collections.sort(al,new SortByName());
		System.out.println(al);
		Collections.sort(al,new SortBySal());
		System.out.println(al);
	}
}




