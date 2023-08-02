class Core2web{
        public static void main(String[] args){
                int row=4;
                int col=4;
                char ch='A';
		char ch1;
                for(int i=1;i<=row;i++){
			ch1=ch;
                        for(int j=1;j<=4-i+1;j++){
                                System.out.print(ch1+" ");
                                ch1++;
                        }
                        ch++;
                        System.out.println();
                }
        }
}

