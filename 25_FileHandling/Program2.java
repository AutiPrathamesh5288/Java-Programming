import java.io.*;

class Test{

	public static void main(String[] args)throws IOException{

		File obj = new File ("Incubator","A.txt");
		obj.createNewFile();

		File obj1 = new File("B.txt");
		obj1.createNewFile();

		System.out.println(obj1.exists());
		System.out.println(obj.compareTo(obj1));

		System.out.println(obj.getParent());
		System.out.println(obj.isFile());
		System.out.println(obj.isDirectory());
		System.out.println(obj.getName());
		System.out.println(obj.getPath());
		System.out.println(obj.getAbsolutePath());






	}
}
