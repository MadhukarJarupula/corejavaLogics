import java.util.Scanner;
class studentavg
{
   public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in); 
		// read the data from command promt
		System.out.println("student name....");
		String studentName=s.next();

		System.out.println("student rollno...");
		int rollNo =s.nextInt();

		System.out.println("science marks...");
		int scienceMarks=s.nextInt();

		System.out.println("maths marks...");
		int mathsMarks=s.nextInt();

		System.out.println("marks social...");
		int socialMarks=s.nextInt();

		int total;
		total=scienceMarks+mathsMarks+socialMarks;

		System.out.println("student total marks"+total);
		
		double avg;
		avg=total/3;

		System.out.println("your avg="+avg);

		if(avg>50)
		{   System.out.println("student name..."+studentName);
		    System.out.println("student roll no..."+rollNo);
			System.out.println("total marks..."+total);
			System.out.println("cograt ! your passed with avarage score of..."+avg);
		}
		else
		{
		 System.out.println("student name..."+studentName);
		 System.out.println("student roll no..."+rollNo);
		 System.out.println("total marks..."+total);
		 System.out.println("sorry! your failed with avarage score of..."+avg);
		 
		}

	}
}