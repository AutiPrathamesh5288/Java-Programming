class Core2web{
        public static void main(String[] rags){
                int N=8;
                if(N%3==0 && N%5==0){
                        System.out.println("fizz_buzz");
                }
                else if(N%3==0){
                        System.out.println("fizz");
                }
		else if(N%5==0){
			System.out.println("buzz");
		}
		else{
			System.out.println("not divisible by both");
		}
        }
}

