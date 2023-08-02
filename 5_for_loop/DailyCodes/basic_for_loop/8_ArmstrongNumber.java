class Arms{
	public static void main(String[] rags){
		int N=153;
		int rem;
		int sum=0;
		int temp1=N;
		int temp2=N;
		int i=1;
		int count=0;
	

		while(temp1!=0){
			count++;
			temp1=temp1/10;
		}
		while(N!=0){
			rem=N%10;
			int mult=1;

		for(i=1;i<=count;i++){
			mult=mult*rem;

		}
			sum=sum+mult;
			N=N/10;
		}

		if(sum==temp2){
			System.out.println("it is armstrong number");
		
		}
		else
		{
			System.out.println("it is not  armstrong number");
		}

	}

}
