class pl{
	public static void main(String[] args){
		double sellingPrice=1400;
		double costPrice=1400;
		double value=(sellingPrice-costPrice);
		if(sellingPrice>costPrice){
			System.out.println("Profit of " +value);
		}
		else if(sellingPrice<costPrice){
                        System.out.println("loss of " +(costPrice-sellingPrice));
                }
		else{
			System.out.println("there is no profit or loss"+(costPrice-sellingPrice));
		}
	}
}
