import java.util.Scanner;
class Adam 
{  static int reverseNumber(int number)
	{
		int reverseNumber = 0;
		while (number!=0)
		{
			int digit = number % 10;
			reverseNumber = reverseNumber * 10 + digit;
			number  = number/10;
		}
		return reverseNumber;
	}
	public static void main(String[] args) 
	{   
		//input number from end user
		Scanner s = new Scanner(System.in);
		System.out.println("Eneter a number to check Adam or not");
		int number = s.nextInt();

          // sqaure given number
		int square = number*number;

          // reverse  given number
		int reverseNumber = Adam.reverseNumber(number);
          
		  //Square reversed number
		int rnSquare = reverseNumber * reverseNumber;

            // reverse square of reverse number
         int rsquare = Adam.reverseNumber(rnSquare);

		 if (rsquare==square)
		 {
			 System.out.println("the given number is Adam");
		 }
		 else 
		{
			System.out.println("Given number is not Adam ");
		}
		s.close();

	}
	
}
