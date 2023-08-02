class Core2web{
        public static void main(String [] args){
                int n=3;
		char ch='Z';
		int num=26;
                for(int i=1;i<=4;i++){
			
                        for(int j=1;j<=4;j++){
				if(j%2==1){

                                System.out.print((num)+" ");
				num--;
				}
				else{
					System.out.print(ch+" ");
					ch--;
				}
                        }
                        System.out.println();
                }
        }
}

