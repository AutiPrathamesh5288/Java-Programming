import java.util.*;
class Demo{
        public static void main(String [] args){
                Scanner sc=new Scanner(System.in);

		System.out.println("Enter the size of array");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
	//	int num=1;
//		int count=0;

		for(int i=0;i<arr.length;i++){
		int count=0;
			for(int j=1;j<arr.length;j++){
			if(arr[i]%j==0){
				count++;	
			}
		}
		if(count>2){
			System.out.println("Composite number is " + arr[i] +" found at index "+i);
		}
		
	}

		
    }
}
		
