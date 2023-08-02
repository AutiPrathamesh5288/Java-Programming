class Core2web{
	public static void main(String [] args){
	
		int x=10  ; // this is not possible 

		{
			int x=20;
			System.out.println(x);
		}
		{
                        int x=30;
                        System.out.println(x);
                }
	//	int x=10;  //this is possible for doing most initialization
                System.out.println(x);

      
	}
}
