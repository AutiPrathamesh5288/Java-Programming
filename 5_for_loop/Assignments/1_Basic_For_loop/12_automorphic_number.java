class Core2web{
        public static void main(String[] args){
                 int N=25;
		 int sq=N*N;
                 int i=1;
		 int temp=N;
                 int rev=0;
		 int rev1=0;
		 int count=0;
		 while(N!=0){
			 int rem=N%10;
			 rev=rev*10+rem;
			 N=N/10;
			 count++;
		 }
		 for(i=1;i<=count;i++){
			 int rem1=sq%10;
			 rev1=rev1*10+rem1;
			 sq=sq/10;
		 }
		 if(rev==rev1){
			 
                	 System.out.println(temp+" is a automorphic Number");
		 }
		 else{
			System.out.println(temp+" is not  a automorphic Number");
		 }

        }
}

