class Switchdemo{
	public static void main(String[] args){
	//	int x=3;

		int x=3;
		switch( x){
			case 'x':
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
                                System.out.println("3");
				break;
                        case 4:
                                System.out.println("4");
				break;
			case 5:
                                System.out.println("5");
				break;
                        default: //least priority
                                System.out.println("Invalid");
				break;
		}
		System.out.println("Aftern Switch");
	}
}

