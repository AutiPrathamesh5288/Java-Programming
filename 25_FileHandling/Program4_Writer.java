import java.io.*;

class FileDemo {
	public static void main(String[] args)throws IOException{

		File f = new File("Jaguar.txt");
		FileWriter fw = new FileWriter(f,true);

		fw.write("testing\n");
		fw.write("Devops\n");
		fw.write("Salesforce\n");

		fw.close();

	}
}



