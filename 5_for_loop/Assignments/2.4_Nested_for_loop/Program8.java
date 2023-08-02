class Core2web{
        public static void main(String[] args){
                int row=4;
                int col=4;
                int num=10;
		char ch='J';
                for(int i=1;i<=row;i++){
                        for(int j=1;j<=i;j++){
				if(i%2==1){
                                System.out.print(num+" ");
	//			num--;
	//			ch--;
				}
				else{
					System.out.print(ch+" ");
	//				ch--;
	//				num--;
			}
                        
		num--;
			ch--;
			}

                        
                        System.out.println();
                }
        }
}

