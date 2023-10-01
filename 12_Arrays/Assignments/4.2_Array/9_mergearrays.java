import java.io.*;
class demo{
	public static void main(String[] rags)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the size of array");
		int size1=Integer.parseInt(br.readLine());

		int arr1[]=new int [size1];

		System.out.println("Enter the elements");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("enter the size of array-2");
                int size2=Integer.parseInt(br.readLine());

                int arr2[]=new int [size2];

                System.out.println("Enter the elements");
                for(int i=0;i<arr2.length;i++){
                        arr2[i]=Integer.parseInt(br.readLine());
                }


                int arr3[]=new int [size1+size2];

		for(int i=0;i<arr1.length;i++){
                        arr3[i]=arr1[i];

                }

                for(int i=0;i<arr2.length;i++){
                        arr3[size1+i]=arr2[i];
                }
		System.out.println("mergeed elements are");

		for(int i=0;i<arr3.length;i++){
                      System.out.println(arr3[i]);
                }
	}
}

