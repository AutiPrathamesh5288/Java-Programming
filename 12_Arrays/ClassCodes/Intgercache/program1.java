class Demo{
        public static void main(String[] args){

                int a=10;
                int b=10;
               String c= "Hello";

                System.out.println(System.identityHashCode(a));
                System.out.println(System.identityHashCode(b));
                System.out.println(System.identityHashCode(c));
        }
}

