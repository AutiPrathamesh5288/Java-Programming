class HashCodeExample {

    public static void main(String[] args) {
        String str = "Hello";
        int hashCode = str.hashCode();
        System.out.println("Hash code of 'Hello': " + hashCode);
        
        Integer num = 42;
        hashCode = num.hashCode();
        System.out.println("Hash code of 42: " + hashCode);
        
        // Using your custom class
        MyObject obj = new MyObject("example");
        hashCode = obj.hashCode();
        System.out.println("Hash code of custom object: " + hashCode);
    }
}

class MyObject {
    private String value;
    
    public MyObject(String value) {
        this.value = value;
    }
    
    @Override
    public int hashCode() {
        // Implement your custom hash code calculation here
        // ...
    }
}
}
