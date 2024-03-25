import java.util.Scanner;
class feedBack 
{ 
	public static void main(String[] args) 
	{ //scanner object creation

		Scanner s =new Scanner(System.in);

		System.out.println("Enter grade..A B C D..");
		char grade=s.next().charAt(0);
		String feedback = null;

		switch (grade)
		{
		case 'A': feedback ="Excelent job";
		          break;
		case 'B': feedback ="Good job";
		          break;
		case 'C': feedback ="you can do better";
		          break;
		case 'D': feedback ="Need improvement";
		          break;

	    default: System.out.println("enter valid option..");
		        break;
		} 
		System.out.println("feedback :"+feedback);
		s.close();
	} 
}
