enum Lineup {
	Rohit,
	Gill,
	Virat,
	KLRahul,
	Ishan;
		

	public static void main(String[] args){

		Lineup player = Lineup.Virat;

		switch(player){

			case Rohit :
				System.out.println("Sharma");
				break;
			case Gill :
				System.out.println("Sarna");
				break;
			case Virat :
				System.out.println("Kohli");
				break;
			case KLRahul :
				System.out.println("Shetty");
				break;
			case Ishan :
				System.out.println("Kishan");
				break;
			default :
				System.out.println("Afridi");
		}
	}
}



