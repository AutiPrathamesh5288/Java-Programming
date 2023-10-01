import java.util.*;

class Movies implements Comparable {

	String movieName=null;
	float totColl=0f;

	Movies(String movieName , float totColl){

		this.movieName=movieName;
		this.totColl=totColl;

	}
	public int compareTo(Object obj){
		return (movieName.compareTo(((Movies)obj).movieName));
	}
	public String toString(){

		return movieName;
	}
}
class TreeSetDemo{

	public static void main(String[] args){

		TreeSet ts = new TreeSet();

		ts.add(new Movies("Pathaan",50f));
		ts.add(new Movies("Pathaan",50f));
		ts.add(new Movies("Gadar2",150f));
		ts.add(new Movies("Pathaan",50f));
		ts.add(new Movies("Pathaan",50f));
		ts.add(new Movies("Jawan",250f));
		ts.add(new Movies("Pathaan",50f));
		ts.add(new Movies("Pathaan",50f));


		System.out.println(ts);
	}
}

