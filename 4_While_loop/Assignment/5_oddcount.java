class Oddcount{
	public static void main(String[] args){
		int num=98723484;
		int count=0;

		while(num!=0){
			int N=num%10;
			if(N%2!=0){
				count++;
			}
			num=num/10;
		}
		System.out.println(count);
	}
}

