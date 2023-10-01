import java.io.*;

class Demo{
	public static void main(String [] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of array:");
		int size=Integer.parseInt(br.readLine());

		int arr[] =new int [size];

		System.out.println("enter the elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		int min;
		min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println("Minimun number is"+min);
	}
}



