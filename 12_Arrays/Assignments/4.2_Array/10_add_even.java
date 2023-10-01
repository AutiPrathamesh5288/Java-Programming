import java.io.*;
class demo{
        public static void main(String[] rags)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("enter the size of array");
                int size=Integer.parseInt(br.readLine());

                int arr[]=new int [size];

                System.out.println("Enter the elements");
                for(int i=0;i<arr.length;i++){
                        arr[i]=Integer.parseInt(br.readLine());
                }
		System.out.println("Output is:");

		
		
		for(int i=0;i<arr.length;i++){
			int temp=arr[i];
                        int sum=0;

			while(temp!=0){
				int rem=temp%10;
				sum=sum+rem;
				temp=temp/10;
			}
			if(sum%2==0){
				System.out.println(arr[i]);
			}

		}
	}
}


