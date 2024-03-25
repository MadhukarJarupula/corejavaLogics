import java.util.Scanner;
class bookingTicket
{
    public static void main(String[] args) 
	{ //creation of scanner object
		Scanner s =new Scanner(System.in);

		System.out.println("Enter booking status..online/offline");
		String status=s.next();

      if(status.equalsIgnoreCase("online"))
		{
			System.out.println("directly go to the movie...");
		}

	  else if (status.equalsIgnoreCase("offline"))
	  {
          System.out.println("Go to box office and take the tickerts..,");
	  }

	  else
		{
			System.out.println("enter valid input...");
		}

		s.close();
	}
}
