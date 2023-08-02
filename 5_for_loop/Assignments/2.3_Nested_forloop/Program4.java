class Core2web{
        public static void main(String[] args){

                int row=4;
                int col=4;

                for(int i=1;i<=row;i++){
                        for(int j=1;j<=row-i+1;j++){

                                System.out.print("3C ");
                        }
                        System.out.println();
                }
        }
}

