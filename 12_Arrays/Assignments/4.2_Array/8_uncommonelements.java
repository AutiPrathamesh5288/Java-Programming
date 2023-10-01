import java.io.*;
class Demo{
        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter the size of one array");
                int size1=Integer.parseInt(br.readLine());

                int arr1[]=new int[size1];

                System.out.println("Enter the elements");
                for(int i=0;i<arr1.length;i++){
                        arr1[i]=Integer.parseInt(br.readLine());
                }

                System.out.println("Enter the size of two array");
                int size2=Integer.parseInt(br.readLine());

                int arr2[]=new int[size2];

                System.out.println("Enter the elements");
                for(int j=0;j<arr2.length;j++){
                        arr2[j]=Integer.parseInt(br.readLine());
                }

		System.out.println("uncommon elements are");
		int flag=0;
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println(arr1[i]);
			}
			flag=0;
		}
		for(int j=0;j<arr2.length;j++){
                        for(int i=0;i<arr1.length;i++){
                                if(arr1[i]==arr2[j]){
                                        flag=1;
                                        break;
                                }
                        }
                        if(flag==0){
                                System.out.println(arr2[j]);
                        }
                        flag=0;
                }
	}
}































