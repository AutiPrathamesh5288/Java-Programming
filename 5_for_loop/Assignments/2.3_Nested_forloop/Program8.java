class Core2web{
        public static void main(String[] args){

                int row=4;
                int col=4;
		char ch='J';
                for(int i=1;i<=row;i++){
                        for(int j=1;j<=i;j++){

                                System.out.print((ch)+" ");
				ch--;

                        }
                        System.out.println();
                }
        }
}

