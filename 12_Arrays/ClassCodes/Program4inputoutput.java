import java.util.Scanner;
class Demo{
	public static void main(String[] rags){
		Scanner sc=new Scanner(System.in);
		char a[]=new char[2];
		int sum=0;
		for(int i=0;i<a.length;i++){
			a[i]=sc.next().charAt(0);
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
