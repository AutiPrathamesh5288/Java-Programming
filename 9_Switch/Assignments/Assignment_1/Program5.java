import java.util.*;
class Season{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose choice which season you likes:");
		System.out.println("1.Summer");
		System.out.println("2.Winter");
		System.out.println("3.Monsoon");
		int Choice=sc.nextInt();
		switch (Choice){
			case 1:{
				System.out.println("Choose wish to go in which place in this season");
				System.out.println("1.Goa");
				System.out.println("2.Thailand");
				System.out.println("3.Hillstation");
				System.out.println("4. Village");
				int wish=sc.nextInt();

				switch(wish){
					case 1:
						System.out.println("You want to go Goa Very challak bro very challak");
						break;
				
					case 2:
						System.out.println("You want to go Thailand ");
						break;
						
					case 3:
						System.out.println("You want to go Hillstation");
						break;
						
					case 4:
						System.out.println("You want to go Village for eating free of cost mangoes");
						break;
					default:
						System.out.println("Invalid Wish");
				}
				
			}
			break;
			case 2:{
			        System.out.println("Choose wish to go in which place in this season");
                                System.out.println("1.In Bed");
                                System.out.println("2.Not anywhere");
                                int wish=sc.nextInt();

                                switch(wish){
                                        case 1:
                                                System.out.println("You want to go In bed");
                                                break;

                                        case 2:
                                                System.out.println("You want to live in home");
                                                break;

                                        default:
                                                System.out.println("Invalid Wish");
                                }

                        }
			break;
			case 3:{
				System.out.println("Choose wish to go in which place in this season");
                                System.out.println("1.Khandala");
                                System.out.println("2.Mahabaleshwar");
                                int wish=sc.nextInt();

                                switch(wish){
                                        case 1:
                                                System.out.println("You want to go Khandal");
                                                break;

                                        case 2:
                                                System.out.println("You want to go Mahabaleshwar");
                                                break;

                                        default:
                                                System.out.println("Invalid Wish");
                                }

                        }
			break;
				
		}
	}
}

		
				
				


