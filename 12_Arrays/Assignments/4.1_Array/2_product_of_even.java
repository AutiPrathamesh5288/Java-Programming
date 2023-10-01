import java.util.*;
class array{
        public static void main(String []args){
                Scanner sc=new Scanner (System.in);
                System.out.println("Enter size of array");
                int size=sc.nextInt();
                int arr[] =new int[size];
                System.out.println("Enter the array elemnts");
                int mult=1;
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                        if(arr[i]%2==0){
                                mult=mult*arr[i];
                        }
                }
                System.out.println("Product  of array is:"+mult);
        }
}

