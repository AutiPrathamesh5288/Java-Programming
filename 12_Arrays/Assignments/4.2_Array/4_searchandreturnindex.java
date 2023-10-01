import java.io.*;
class Demo{
	public static void main(String[] rags)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter size of array");
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];
		
		System.out.println("Enter elments");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Enter elements that you have to search");
		int ele=Integer.parseInt(br.readLine());

		for(int i=0;i<arr.length;i++){
			if(arr[i]==ele){
				System.out.println("Required elment is found its index is:"+i);
			}
		}
	}
}
