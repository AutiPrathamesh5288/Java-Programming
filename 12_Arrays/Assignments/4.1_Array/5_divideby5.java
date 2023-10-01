import java.util.*;
class array{
        public static void main(String []args){
                Scanner sc=new Scanner (System.in);
                System.out.println("Enter size of array");
                int size=sc.nextInt();
                int arr[] =new int[size];
                System.out.println("Enter the array elemnts");
                
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("divisible by 5 are:");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%5==0){
			       System.out.println(arr[i]);
			}
		}
        }
}

