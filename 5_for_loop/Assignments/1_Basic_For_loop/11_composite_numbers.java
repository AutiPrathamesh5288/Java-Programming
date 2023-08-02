class Core2web{
        public static void main(String[] args){
                 int N=6;
                 int i=1;
                 int count=0;
                 for(i=1;i<=N;i++){
			 if(N%i==0){
				 count++;
			 }
			 if(count>2){
				 break;
			 }
                 }
		 System.out.println(i);
		 if(count>2){
			 System.out.println(N+" is composite number");
		 }
		 else{
			 System.out.println(N+ " is not composite");
		 }


        }
}

