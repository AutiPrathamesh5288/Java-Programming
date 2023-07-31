class Evo{
	public static void main(String[] args){
		int n=7;
		int i=1;

		if(n%2==0){
			while(n>=0){
				System.out.println(n);
				n--;
			}
		}
		else if(n%2!=0){
			while(n>=0){
			System.out.println(n);
			n=n-2;
			}
		}
	}
}
