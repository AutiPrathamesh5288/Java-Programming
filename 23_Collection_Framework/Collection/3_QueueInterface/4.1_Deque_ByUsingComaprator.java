import java.util.*;

class Project implements Comparable {

	String projName = null;
	int teamSize =  0;
	int duration =0;

	Project(String projName , int teamSize, int duration){

		this.projName = projName;
		this.teamSize = teamSize;
		this.duration = duration;
	}
	public int compareTo(Object obj){
		return (projName).compareTo(((Project)obj).projName);
	}
	public String toString(){

		return projName+":"+teamSize+":"+duration;

	}

	public static void main(String[] args){

		Deque dq = new LinkedList();
		dq.add(new Project("Java",8,90));
		dq.add(new Project("C",9,40));
		dq.add(new Project("C++",28,20));
		dq.add(new Project("Python",1,80));

		System.out.println(dq);

	}
}

