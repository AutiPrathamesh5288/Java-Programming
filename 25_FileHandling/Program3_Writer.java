import java.io.*;

class FileDemo{

	public static void main(String[] args)throws IOException{

		FileWriter fw = new FileWriter("Jaguar.txt");

		fw.write("Flutter");
		fw.write("Backend");
		fw.write("FrontEnd");

		fw.close();
	}
}


