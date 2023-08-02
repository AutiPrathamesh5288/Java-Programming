import java.util.*;
class User{
	public static void main(String[] args){

		Scanner sc=new Scanner (System.in);
		System.out.println("What's your Interest");
		System.out.println("1.movies");
		System.out.println("2.series");
		System.out.println("Enter Your Choice: ");
		int choice = sc.nextInt();
		switch(choice){
			case 1:{
				       
				       System.out.println("Movie you wish to watch today");
				       System.out.println("1.Founder");
				       System.out.println("2.Jobs");
				       System.out.println("3.Snowden");
				       System.out.println("4.Her");
				       System.out.println("Enter Your wish");
				       int wish=sc.nextInt();

				       switch(wish){

					       case 1:
						       System.out.println("You wished to watch Founder");
						       break;

					       case 2:
						       System.out.println("You wished to watch Jobs");
						       break;
					       case 3:
						       System.out.println("You wished to watch Snowden");
						       break;
					       case 4:
						       System.out.println("You wished to watch Her");
						       break;
					       default:
						       System.out.println("Invalid Wish");
				       }
			}
			break;
			case 2:{
				      
				       System.out.println(" Series you wish to watch today");
				       System.out.println("1.Silicon Valley");
				       System.out.println("2.Devs");
				       System.out.println("3.Wednesday");
				       System.out.println("4.Mr Robot");
				       System.out.println("Enter Your wish");
				       int wish=sc.nextInt();

				       switch(wish){

					      case 1:
						       System.out.println("You wished to watch Silicon Valley");
						       break;
					      case 2:
                                                       System.out.println("You wished to watch Devs");
                                                       break;

					      case 3:
                                                       System.out.println("You wished to watch Wednesday");
                                                       break;
					      case 4:
                                                       System.out.println("You wished to watch Mr. Robot");
                                                       break;

					      default :
						       System.out.println("Invalid Choice");
				       }
			}
			
		}
	}
}
   
   
   
   
   
   
				
