import java.util.*;
class Client{
	public static void main(String[] args){

		Scanner sc=new Scanner (System.in);
		int num1,num2;

		System.out.println("Enter number 1");
		num1=sc.nextInt();

		System.out.println("Enter number 2");
		num2=sc.nextInt();

		if(num1<0 || num2<0){
			System.out.println("Sorry negative numbers are not allowed");
		}
		else{
			switch((num1*num2)%2){
				case 0:
					System.out.println("multiplication is even");
					break;

				case 1:
					System.out.println("multiplication is odd");
					break;

			}
		}
	}
}





		


