import java.io.*;
class Student{
	public static void main (String[] args) throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		int marathiMarks;
		System.out.println("Enter marathi subject marks"); 
		marathiMarks=Integer.parseInt(br.readLine());

		int englishMarks;
		System.out.println("Enter English subject marks"); 
		englishMarks=Integer.parseInt(br.readLine());

		int hindiMarks;
		System.out.println("Enter Hindi subject marks"); 
		hindiMarks=Integer.parseInt(br.readLine());

		int mathMarks;
		System.out.println("Enter Maths subject marks"); 
		mathMarks=Integer.parseInt(br.readLine());

		int historyMarks;
		System.out.println("Enter History subject marks"); 
		historyMarks=Integer.parseInt(br.readLine());

		if(marathiMarks<35||englishMarks<35||hindiMarks<35||mathMarks<35||historyMarks<35){
			System.out.println("You are fail in Exam");
		}
		else{
			double avg=(marathiMarks+englishMarks+hindiMarks+mathMarks+historyMarks)/5;

			char ch;
			if (avg>85)
				ch='A';
			else if (avg>75)
				ch='B';
			else if (avg>60)
				ch='C';
			else if (avg>50)
				ch='D';
			else if (avg>35)
				ch='E';

			else 
				ch='F';



			switch (ch){
				case 'A':
					System.out.println("First class with Distinction");
					break;
				case 'B':
					System.out.println("First clas");
					break;
				case 'C':		
					System.out.println("Second clas");
					break;
				case 'D':

					System.out.println("Third clas");
					break;
				case 'E':
					System.out.println("Pass");
					break;
				case 'F':				
					System.out.println("Fail");
					break;

			}
		}
	}
}

				

