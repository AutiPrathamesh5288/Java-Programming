class mt{
	public static void main(String[] args){
		int num1=2,num2=2,num3=2;
		if(num1==num2 && num2==num3){
			        System.out.println("All numbers are equal");
                }
		else if(num1>=num2 && num1>=num3){
			System.out.println(num1+"is the maximum between "+num1+","+num2+"and"+num3);
		}
		else if(num2>=num3 && num2>=num1){
		        System.out.println(num2+"is the maximum between "+num1+","+num2+"and"+num3);
                }
		else if(num3>=num2 && num3>=num1){
			        System.out.println(num3+"is the maximum between "+num1+","+num2+"and"+num3);
                }




	}
}
