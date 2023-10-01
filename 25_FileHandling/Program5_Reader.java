import java.io.*;
/*
class FileReader {
	public static void main(String[] args)throws IOException{

		FileReader fr = new FileReader("Jaguar.txt");
		int data = fr.read();
		while(data != -1){
			System.out.print((char)data);
			data=fr.read();
		}
		fr.close();
	}
}*/
import java.io.*;

class FileReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Jaguar.txt");
            int data = fr.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fr.read();
            }
            fr.close();
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

