import java.io.*;
class Demo{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

		System.out.println("enetr the size of array");
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];
		
		System.out.println("Enter the Elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		int max;
		max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		System.out.println("maximum number is"+max);
	}
}

