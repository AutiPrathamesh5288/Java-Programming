import java.util.*;
class array{
        public static void main(String []args){
                Scanner sc=new Scanner (System.in);
                System.out.println("Enter size of array");
                int size=sc.nextInt();
                char arr[] =new char[size];
                System.out.println("Enter the character elemnts");
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.next().charAt(0);
		}
		System.out.println("Vowels are");
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='a'){
                                System.out.println(arr[i]);
                        }
			if(arr[i]=='e'){
                                System.out.println(arr[i]);
                        }
			if(arr[i]=='i'){
                                System.out.println(arr[i]);
                        }
			if(arr[i]=='o'){
                                System.out.println(arr[i]);
                        }
			if(arr[i]=='u'){
                                System.out.println(arr[i]);
                        }

		}
			  
        }
}
