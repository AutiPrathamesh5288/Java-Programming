import java.util.*;
import java.io.*;

class Employee{

	String empName;
	float sal;

	Employee(String empName,float sal){
		this.empName=empName;
		this.sal=sal;
	}
	public String toString(){

		return empName + ":"+sal;
	}
}
	class SortByName implements Comparator<Employee>{

		public int compare(Employee obj1,Employee obj2){
			return (obj1.empName.compareTo(obj2.empName));
		}
	}
	class SortBySal implements Comparator<Employee>{
		
		public int compare(Employee obj1,Employee obj2){
			return (int)(obj1.sal-obj2.sal);
		}
	}

class ListSortDemo{
	public static void main(String[] args){
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Kanha",20000f));
		al.add(new Employee("Rajesh",10000f));
		al.add(new Employee("Sathe",25000f));
		al.add(new Employee("Sarsawati",30000f));

		System.out.println(al);
		Collections.sort(al, new SortByName());
		System.out.println(al);
		Collections.sort(al, new SortBySal());
		System.out.println(al);
	}
}




