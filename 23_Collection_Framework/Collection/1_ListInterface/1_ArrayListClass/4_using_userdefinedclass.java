import java.util.*;

class CricPlayer{
	int jerNo=0;
	String name=null;

	CricPlayer(int jerNo,String name){

		this.jerNo=jerNo;
		this.name=name;

	}
	public String toString(){
		return jerNo +":"+name;
	}
	public static void main(String[] args){

		ArrayList al=new ArrayList();
		al.add(new CricPlayer(18,"Virat"));
		al.add(new CricPlayer(07,"Dhoni"));
		al.add(new CricPlayer(33,"Hardik"));

		System.out.println(al);
	}
}
//if in this program not given toString method then it prints address it not converts it in String
		

