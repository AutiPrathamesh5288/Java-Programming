class Evensq{
	public static void main(String[] args){
		int N=92847852;
		int count=0;
		int sqr;

		while(N!=0){
			int rem = N%10;
			if(rem%2==0){
				System.out.println(rem*rem);
			}
			N=N/10;
		}
	}
}



