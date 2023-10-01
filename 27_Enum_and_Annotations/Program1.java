enum Proglang{
	c , cpp , Java,Python
}
class EnumDemo{

	public static void main(String[] args){
		Proglang pl = Proglang.c;
		int ordinal = pl.ordinal();

		System.out.println(Proglang.c);
		System.out.println(Proglang.Java);
		System.out.println(ordinal);

	}
}

/*
 * OUTPUT
c
Java
0
*/
