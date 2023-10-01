import java.io.*;
class Demo{
	public static void main (String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("enter size of array");
		int size=Integer.parseInt(br.readLine());
	
		int arr[]=new int[size];

		System.out.println("Enter the Elemnts:");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		int esum=0,osum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				esum=esum+arr[i];
			}
			else{
				osum=osum+arr[i];
			}
		}
		System.out.println("Even sum is:"+esum);
		System.out.println("odd sum is:"+osum);
	}
}


