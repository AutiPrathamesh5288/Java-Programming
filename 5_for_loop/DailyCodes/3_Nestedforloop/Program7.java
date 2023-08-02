class Core2web{
        public static void main(String[] args){
                int row=4;
                int col=4;

                for(int i=1;i<=row;i++){
			char ch='A';
                        for(int j=1;j<=4-i+1;j++){
                                System.out.print(ch++ +" ");
                        }
                        System.out.println();
                }
        }
}

