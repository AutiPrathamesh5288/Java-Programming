class Core2web{
        public static void main(String [] args){
                int n=3;
		char ch='A';
		char ch1='a';
                for(int i=1;i<=4;i++){
                        for(int j=1;j<=4;j++){
				if(j%2==1){
                                System.out.print(ch+" ");
                        }
			else{
                        System.out.print(ch1+" ");
			}
			ch++;
			ch1++;
			
                }
		System.out.println();
        }
	}
}

