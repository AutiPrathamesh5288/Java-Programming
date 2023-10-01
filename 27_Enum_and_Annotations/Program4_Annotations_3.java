// 3. Depricated :- it says that no more used this method may be this method is gets discarded in future

class A{
	void m(){
		System.out.println("hello m");
	}

	@Deprecated
	void n(){
		System.out.println("hello n");
	}
}

class TestAnnotation3{
	public static void main(String args[]){

	A a=new A();
	a.n();
	}
}

