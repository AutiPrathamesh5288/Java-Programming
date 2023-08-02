class Core2web{
        public static void main(String [] args){
                int n=3;
                for(int i=1;i<=6;i++){
			char ch='F';
                        for(int j=1;j<=6;j++){
				if(j%2==1){
                                System.out.print((ch)+" ");

				}
				else{
					System.out.print((7-j)+" ");
				}
				ch--;
                        }
                        System.out.println();
                }
        }
}

