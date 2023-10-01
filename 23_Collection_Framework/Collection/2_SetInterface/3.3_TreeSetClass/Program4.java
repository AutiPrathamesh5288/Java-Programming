import java.util.*;
class Myclass {

        public static void main(String[] args){

                TreeSet ts=new TreeSet();
                ts.add(new StringBuffer("Kanha"));
                ts.add(new StringBuffer("Ashish"));
                ts.add(new StringBuffer("Rahul"));
                ts.add(new StringBuffer("Badhe"));

                // it check by ascii value not by alphabetical order

                System.out.println(ts);
        }
}
