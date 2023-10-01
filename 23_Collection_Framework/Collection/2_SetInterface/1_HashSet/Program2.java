import java.util.*;

class HashSetDemo{

        public static void main(String[] args){

                HashSet hs = new HashSet();
                hs.add("Kanha");
		System.out.println(("Kanha").hashCode());
                hs.add("Rahul");
                hs.add("Ashish");
                hs.add("Badhe");
                hs.add("Rahul");
                hs.add("Ashish");

                System.out.println(hs);
        }
}

