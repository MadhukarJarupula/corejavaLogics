import java.util.Scanner;
class weekDays 
{
	public static void main(String[] args) 
	{ //Scanner object creation
		Scanner s=new Scanner(System.in);

		System.out.println("Enter day's in a week");
		String days = s.next();

		switch (days)
		{
		case "monday"  :  System.out.println("mondays are bad...");
                         break;

		case "friday"  : System.out.println("fridays are good...");
		                 break;

		case "saturday":
	    case "sunday"  :System.out.println("party days enjoy..");
		                 break;

		case "tuesday" :
		case "wednesday":
		case "thursday" :System.out.println("mid days are \"ok ok\"...");
		                 break;

		default: System.out.println("enter valid week days..");
		         break;
		} 
		s.close();
	}   
}
