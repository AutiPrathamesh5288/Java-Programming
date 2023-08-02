class Core2web{
        public static void main(String[] args){
                int row=4;
                int col=4;
		char ch='A';
		int num=1;

                for(int i=1;i<=row;i++){
                        for(int j=1;j<=4-i+1;j++){
				if(j%2==1){

                                System.out.print(ch+" ");
				ch++;
				}
				else{
					System.out.print(num+" ");
					num++;
				}

                        }
                        System.out.println();
                }
        }
}

