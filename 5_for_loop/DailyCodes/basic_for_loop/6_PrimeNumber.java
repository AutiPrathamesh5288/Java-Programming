class Prime{
	public static void main(String [] args){
		int N=5;
		int count=0;

		for(int i=1;i<=N;i++){
			if(N%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.println(N+" is a prime number");
		}
		else
		{
                        System.out.println(N+" is not  a prime number");
                }
	}
}

