class factcount{
	public static void main(String [] args){

		int N=6;
		int i=1;
		int count=0;
		for(i=1;i<=N;i++){
			if(N%i==0){
				count++;
			}
		}
		System.out.println(count);
	}
}

