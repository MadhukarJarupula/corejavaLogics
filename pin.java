import java.util.Scanner;
class Pin 
{
	public static void main(String[] args) 
	{
	 Scanner s= new Scanner(System.in);

	 int pin = 12343;

	 for (int i=1;i<=4;i++)
	 {
		 System.out.println("Enter you pin..");
		 int cpin = s.nextInt();

		 if (cpin==pin)
		 {
			 System.out.println("you entered correct pin...");
			 break;
		 }
		else 
		{  
           System.out.println("you entered wrong pin plz try again");
		} 
		if (i==4)
		{
			System.out,println("your attempts completed plz try after 24hrs..");
		}
	 }
		 
	 }
}

