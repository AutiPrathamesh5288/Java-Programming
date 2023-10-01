// program to find even count using array
import java.io.*;
class Demo{
        public static void main(String[] rags)throws IOException{
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int [size];
		System.out.println("Enter the elements");
                int count=0;
                for(int i=0;i<arr.length;i++){
                      	arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
				count++;
               		}
		}
                System.out.println("evne numbers are out of all: "+count);
        }
}

