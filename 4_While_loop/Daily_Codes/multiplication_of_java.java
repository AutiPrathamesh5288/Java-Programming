class Core2web{
        public static void main(String[] args){
                int N=6531;
                int mult=1;
                while(N!=0){
                        int rem=N%10;
                       mult =mult*rem;
                        N=N/10;
                }
                System.out.println(mult);
        }
}
