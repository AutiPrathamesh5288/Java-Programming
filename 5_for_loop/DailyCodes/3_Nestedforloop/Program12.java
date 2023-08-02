class Core2web{
        public static void main(String[] args){
                int row=4;
                int col=4;
		int num=1;
                for(int i=1;i<=row;i++){
                        for(int j=1;j<=4-i+1;j++){
				if(j%2==0){

                                System.out.print(num*num +" ");
				}
				else{
					System.out.print(num+" ");
				}
				num++;
                        }
                        System.out.println();
                }
        }
}

