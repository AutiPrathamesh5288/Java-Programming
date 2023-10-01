import java.util.*;
class India implements Comparable{

	String nameOfState;
	float population;

	India(String nameOfState , float population){

		this.nameOfState=nameOfState;
		this.population=population;
	}
	public int compareTo(Object obj){
		return -(int)(population-((India)obj).population);
	}

	public String toString(){

		return nameOfState+" : "+population;
	}

}
class State{

	public static void main(String [] args){


		System.out.println("Following are States and population in Crore");
		System.out.println("-----------------------------------------");
		TreeSet States=new TreeSet();
		States.add(new India("Uttar Pradesh",8.8f));
		States.add(new India("Maharashtra",11.9f));
		States.add(new India("Bihar",10f));
		States.add(new India("West Bengal",9f));
		States.add(new India("Uttar Pradesh",8.8f));
		States.add(new India("Maharashtra",11.9f));


		System.out.println(States);
	}
}








