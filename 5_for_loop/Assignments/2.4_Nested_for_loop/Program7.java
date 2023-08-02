class Core2web{
        public static void main(String[] args){
                int row=6;
                int col=6;
                int num=1;
		char ch='F';
		char ch1;
                for(int i=1;i<=row;i++){
			ch1=ch;
                        for(int j=1;j<=i;j++){
				if(j%2==1){
					System.out.print(ch1+" ");
					ch1++;
				}
				else{
					System.out.print(num+" ");
					num++;
				}
                                
                        }
                        ch--;
                        System.out.println();
                }
        }
}

