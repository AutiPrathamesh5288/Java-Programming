class Armstrrong{
	public static void main(String[] args){
		int sum = 0;
		int rem = 0;
		int N=153;
		int temp1 = N;
		int temp2 = N;
		int cnt = 0;
		int mult=1;


		while(temp1 != 0){
			cnt++;
			temp1 = temp1 / 10;
		}
		while(N!= 0){
			rem = N % 10;
			for(int i = 1; i <= cnt;i++){
				mult=mult*rem;
			}
			sum=sum+mult;
			N=N/10;
		}
		if(sum==temp2){
			System.out.println("It is armstrong");
		}
		else{
			System.out.println("It not  armstrong");
		}
	}
}
