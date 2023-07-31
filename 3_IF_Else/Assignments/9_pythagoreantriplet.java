class Pt{
	public static void main(String[] args){
		int a=4,b=4,c=5;
		if(a*a+b*b==c*c){
			System.out.println("it is a pythagorean triplet");
		}
		else if(c*c+b*b==a*a){
                        System.out.println("it is a pythagorean triplet");
                }
		else if(a*a+c*c==b*b){
                        System.out.println("it is a pythagorean triplet");
                }
		else{
			System.out.println("it is not pythagorean triplet");
		}
	}
}
