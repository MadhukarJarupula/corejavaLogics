import java.util.Scanner;
class loginCheck
{
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);

		System.out.println("Enter username...");
		String userName=s.next();

		System.out.println("enter password");
		String passWord=s.next();

		if(userName.equals("madhu")&& passWord.equals("Madhu@123"))
		{
			System.out.println("login successfull.."+userName);
		}
		else
		{
			System.out.println("Enter valid username or password and try again"+userName);
		}
		s.close();

	}
}
