class sumevenodd{
	public static void main(String[] args){
		int n=10;
		int i=1;
		int sum=0,mul=1;

		while(i<=10){
			if(i%2==0){
				sum=sum+i;
			}
			else
			{
				mul=mul*i;
			}
			i++;
		}
		System.out.println("sum is"+sum);
		System.out.println("mul is"+mul);
	}
}
