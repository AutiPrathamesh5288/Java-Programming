class Core2web{
        public static void main(String[] args){
                int row=4;
                int col=4;
		char ch='a';
		int num=1;

                for(int i=1;i<=row;i++){
                        for(int j=1;j<=i;j++){
				if(j%2==1){
					System.out.print(num+" ");
				}
				else{
                                System.out.print(ch+" ");
				}
				num++;
				ch++;
                        }
                        System.out.println();
                }
        }
}

