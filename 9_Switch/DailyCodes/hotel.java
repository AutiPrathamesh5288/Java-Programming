class Menu{
	public static void main(String []args){

		String str="Veg";
		System.out.println("----------------------oh-Pune-----------------------------");

		switch(str){
			case "Veg":
				String str1="Starters";
				switch (str1){
					case "Starters":
						System.out.println("Papad-Masala");
						break;

					case "Main food":
						System.out.println("Paneer tikka");
						break;

				}
			case "Non-veg":
				String str2="Starters";
                                switch (str2){
                                        case "Starters":
                                                System.out.println("Leg pieces");
                                                break;

                                        case "Main food":
                                                System.out.println("Chicken Thali");
                                                break;

                                }
		}

	}
}

