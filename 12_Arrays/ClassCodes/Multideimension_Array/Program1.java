class Demo{
	public static void main(String[] args){

		int []arr  [];
		arr=new int [2][3];

		arr[0][1]=2;
		arr[0][0]=4;
		arr[0][2]=6;
		arr[1][0]=12;
		arr[1][1]=14;
		arr[1][2]=16;

		for (int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

