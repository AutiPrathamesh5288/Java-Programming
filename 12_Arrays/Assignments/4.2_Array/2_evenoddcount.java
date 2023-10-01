import java.util.*;
class Demo{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int evencount=0,oddcount=0;
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			if(arr[i]%2==0){
				evencount++;
			}
			else{
				oddcount++;
			}

		}
		System.out.println("Even count is:"+evencount);
		System.out.println("Odd count is:"+oddcount);
	}
}


