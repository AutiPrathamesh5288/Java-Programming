class Core2web{
        public static void main(String[] args){
                int row=4;
                int col=4;
                int num=1;
                for(int i=1;i<=row;i++){

			num=i;
                        for(int j=1;j<=i;j++){
				if(j%2==1){
					if(i%2==1){

					System.out.print(num*num+" ");
					}
					else{
						System.out.print(num*num*num+" ");
					}
				}
				else if(j%2==0){
					if(i%2==0){
						System.out.print(num*num+" ");
					}
					else{
						System.out.print(num*num*num+" ");
					}
				}
					num++;

                        }
			
                       
                        System.out.println();
                }
        }
}

