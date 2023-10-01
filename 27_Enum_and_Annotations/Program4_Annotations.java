//1 . Override Annotation :- used when if we want method ovreriding and if by mistake that in child method name gets wrong then without running it gets error compile time
/*class Demo {

	Demo(String str){
		super(str);
	}
}*/
class Parent{
	Parent(){
		System.out.println("Parent Constructor");
	}
	void m1(){
		System.out.println("Parent-m1");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("Child Constructor");
	}
	@Override
	void m1(){
		System.out.println("Child-m1");
	}
}
class Client{
	public static void main(String[] args){

		Parent p = new Child();
		p.m1();
	}
}

