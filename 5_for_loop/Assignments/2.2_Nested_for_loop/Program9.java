class Core2web{
        public static void main(String [] args){
                int n=1;
                for(int i=1;i<=3;i++){
			char ch='C';
                        for(int j=1;j<=3;j++){
                                System.out.print((n*n)+""+ch+""+(4-j)+" ");
				n++;
				ch--;

                        }
                        System.out.println();
                }
        }
}

